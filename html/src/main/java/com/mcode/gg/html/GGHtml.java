package com.mcode.gg.html;

import com.mcode.gg.core.GG;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class GGHtml extends GwtApplication {
	@Override
	public ApplicationListener getApplicationListener () {
		return new GG();
	}
	
	@Override
	public GwtApplicationConfiguration getConfig () {
		return new GwtApplicationConfiguration(480, 320);
	}
}
