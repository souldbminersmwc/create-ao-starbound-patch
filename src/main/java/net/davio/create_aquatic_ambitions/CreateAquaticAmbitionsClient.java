package net.davio.create_aquatic_ambitions;

import net.davio.create_aquatic_ambitions.entry.CCAPartials;
import net.fabricmc.api.ClientModInitializer;

public class CreateAquaticAmbitionsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		CCAPartials.init();
	}
}
