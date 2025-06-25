package show.miku;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PopularBiologyFix implements ModInitializer {
	public static final String MOD_ID = "popular-biology-fix";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Popular Biology Fix initialized!");
	}
}