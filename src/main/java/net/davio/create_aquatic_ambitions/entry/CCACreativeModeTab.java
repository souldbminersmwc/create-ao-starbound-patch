package net.davio.create_aquatic_ambitions.entry;

import com.simibubi.create.foundation.utility.Components;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;

public class CCACreativeModeTab {

	public static void register(){
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation("create_aquatic_ambitions", "tab_64"), BASE_CREATIVE_TAB);
		ItemGroupEvents.MODIFY_ENTRIES_ALL.register(CCACreativeModeTab::make);
	}

	private static void make(CreativeModeTab creativeModeTab, FabricItemGroupEntries entries) {
		if (creativeModeTab == BASE_CREATIVE_TAB) {
			entries.accept(CCAItems.PRISMARINE_ALLOY);
			entries.accept(CCAItems.PRISMARINE_ROD.get());
			entries.accept(CCAItems.FLINT_SHARD.get());
			entries.accept(CCAItems.POLISHED_QUARTZ_TINE.get());
		}
	}

	public static final CreativeModeTab BASE_CREATIVE_TAB = FabricItemGroup.builder()
			.title(Components.translatable("itemGroup.create_aquatic_ambitions"))
			.icon(CCAItems.PRISMARINE_ALLOY::asStack)
			.build();
}
