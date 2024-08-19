package net.davio.create_aquatic_ambitions.entry;

import java.util.Optional;
import java.util.function.Supplier;

import com.simibubi.create.content.processing.recipe.ProcessingRecipeBuilder;
import com.simibubi.create.content.processing.recipe.ProcessingRecipeSerializer;
import com.simibubi.create.foundation.recipe.IRecipeTypeInfo;
import net.davio.create_aquatic_ambitions.CreateAquaticAmbitions;
import net.davio.create_aquatic_ambitions.kinetics.fan.processing.ChannelingRecipe;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.Container;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import com.simibubi.create.foundation.utility.Lang;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.Level;


public enum CCARecipeTypes implements IRecipeTypeInfo {
	CHANNELING(ChannelingRecipe::new);

	private final ResourceLocation id;
	private final RecipeSerializer<?> serializerObject;
	private final RecipeType<?> typeObject;
	private final Supplier<RecipeType<?>> type;

	CCARecipeTypes(Supplier<RecipeSerializer<?>> serializerSupplier) {
		String name = Lang.asId(name());
		id = CreateAquaticAmbitions.asResource(name);
		serializerObject = Registry.register(BuiltInRegistries.RECIPE_SERIALIZER, id, serializerSupplier.get());
		typeObject = simpleType(id);
		Registry.register(BuiltInRegistries.RECIPE_TYPE, id, typeObject);
		type = () -> typeObject;
	}

	public static void register() {
	}

	public static <T extends Recipe<?>> RecipeType<T> simpleType(ResourceLocation id) {
		String stringId = id.toString();
		return new RecipeType<T>() {
			@Override
			public String toString() {
				return stringId;
			}
		};
	}
	CCARecipeTypes(ProcessingRecipeBuilder.ProcessingRecipeFactory<?> processingFactory) {
		this(() -> new ProcessingRecipeSerializer<>(processingFactory));
	}

	public <C extends Container, T extends Recipe<C>> Optional<T> find(C inv, Level world) {
		return world.getRecipeManager()
				.getRecipeFor(getType(), inv, world);
	}

	@Override
	public ResourceLocation getId() {
		return id;
	}
	@Override
	public <T extends RecipeSerializer<?>> T getSerializer() {
		return (T) serializerObject;
	}

	@Override
	public <T extends RecipeType<?>> T getType() {
		return (T) type.get();
	}
}

