package com.example.examplemod;

import net.fabricmc.api.ClientModInitializer;

public class ClientInit implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ExampleMod.LOGGER.info("Client hooks ready");
    }
}