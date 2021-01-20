package net.ludocrypt.texconex;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.model.ModelLoadingRegistry;
import net.ludocrypt.texconex.obj.ItemOBJLoader;
import net.ludocrypt.texconex.obj.OBJLoader;

public class TexConex implements ClientModInitializer {

	public static Logger LOGGER = LogManager.getLogger("FOML");

	@Override
	public void onInitializeClient() {
		ModelLoadingRegistry.INSTANCE.registerResourceProvider(OBJLoader.INSTANCE);
		ModelLoadingRegistry.INSTANCE.registerVariantProvider(ItemOBJLoader.INSTANCE);
	}

}
