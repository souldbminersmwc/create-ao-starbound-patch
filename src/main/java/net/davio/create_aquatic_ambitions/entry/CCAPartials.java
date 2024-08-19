package net.davio.create_aquatic_ambitions.entry;

import com.jozufozu.flywheel.core.PartialModel;

import net.davio.create_aquatic_ambitions.CreateAquaticAmbitions;

public class CCAPartials {
	public static final PartialModel

			CONDUIT_CAGE = block("conduit_cage"),
			CONDUIT_EYE = block("conduit_eye"),
			CONDUIT_WIND = block("conduit_wind");
	private static PartialModel block(String path) {
		return new PartialModel(CreateAquaticAmbitions.asResource("block/" + path));
	}

	public static void init() {
		// init static fields
	}
}

