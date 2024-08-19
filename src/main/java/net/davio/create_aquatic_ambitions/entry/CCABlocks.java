package net.davio.create_aquatic_ambitions.entry;

import com.tterrag.registrate.util.entry.BlockEntry;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.MapColor;

import static com.simibubi.create.foundation.data.TagGen.pickaxeOnly;
import static com.simibubi.create.foundation.data.TagGen.tagBlockAndItem;
import static net.davio.create_aquatic_ambitions.CreateAquaticAmbitions.REGISTRATE;

public class CCABlocks {
	public static final BlockEntry<Block> PRISMARINE_ALLOY_BLOCK = REGISTRATE.block("prismarine_alloy_block" ,Block::new)
			.initialProperties(() -> Blocks.IRON_BLOCK)
			.properties(p -> p.mapColor(MapColor.METAL).requiresCorrectToolForDrops())
			.transform(pickaxeOnly())
			.tag(BlockTags.NEEDS_STONE_TOOL)
			.transform(tagBlockAndItem("storage_blocks/prismarine"))
			.build()
			.lang("Prismarine Alloy Block")
			.register();

	public static void register() {};
}
