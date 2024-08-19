package net.davio.create_aquatic_ambitions.entry;

import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;
import static net.davio.create_aquatic_ambitions.CreateAquaticAmbitions.REGISTRATE;

public class CCAItems {

	public static final ItemEntry<Item> PRISMARINE_ALLOY = REGISTRATE.item("prismarine_alloy", Item::new).register();
	public static final ItemEntry<Item> PRISMARINE_ROD = REGISTRATE.item("prismarine_rod", Item::new).register();
	public static final ItemEntry<Item> POLISHED_QUARTZ_TINE = REGISTRATE.item("polished_quartz_tine", Item::new).register();
	public static final ItemEntry<Item> FLINT_SHARD = REGISTRATE.item("flint_shard", Item::new).register();

	public static void register() {}
}
