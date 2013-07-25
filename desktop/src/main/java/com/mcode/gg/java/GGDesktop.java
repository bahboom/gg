package com.mcode.gg.java;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import com.mcode.gg.core.GG;

public class GGDesktop {
	public static void main (String[] args) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.useGL20 = false;
		config.title = "GG v1.0";
		//config.fullscreen = true;
		new LwjglApplication(new GG(), config);
	}
}
