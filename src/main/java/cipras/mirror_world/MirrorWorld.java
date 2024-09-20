package cipras.mirror_world;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MirrorWorld implements ModInitializer {
	public static final String MOD_ID = "mirror_world";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Done!");
	}
}