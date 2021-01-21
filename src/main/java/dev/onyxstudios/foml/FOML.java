package dev.onyxstudios.foml;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dev.onyxstudios.foml.obj.ItemOBJLoader;
import dev.onyxstudios.foml.obj.OBJLoader;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.model.ModelLoadingRegistry;

public class FOML implements ClientModInitializer {

	public static Logger LOGGER = LogManager.getLogger("FOML");

	@Override
	public void onInitializeClient() {
		ModelLoadingRegistry.INSTANCE.registerResourceProvider(OBJLoader.INSTANCE);
		ModelLoadingRegistry.INSTANCE.registerVariantProvider(ItemOBJLoader.INSTANCE);
		ModelLoadingRegistry.INSTANCE.registerVariantProvider(r -> OBJLoader.INSTANCE::loadModelResource);
	}

}
