package com.tacstargame.rendering;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.tacstargame.rendering.util.RenderSettings;
import com.tacstargame.ui.TacStarScreen;

public class RenderImpl extends Render {
	
	public RenderImpl(RenderSettings renderSettings) {
		super(renderSettings);
	}

	@Override
	public void render(TacStarScreen screen) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		renderBackground(screen);
		renderContent(screen);
		renderLight(screen);
		renderUI(screen);
		batch.end();
	}

	@Override
	public void renderBackground(TacStarScreen screen) {
		if (renderBackground && screen.getBackground() != null) {
			screen.getBackground().render(batch);
		}		
	}

	@Override
	public void renderLight(TacStarScreen screen) {
		if (renderLight && screen.getRayHandler() != null) {
			screen.getPhysic().step(1/60f, 6, 2);
			screen.getRayHandler().setCombinedMatrix(camera.combined);
			screen.getRayHandler().updateAndRender();
		}
		
	}

	@Override
	public void renderUI(TacStarScreen screen) {
		if (renderUI && screen.getUI() != null) {
			screen.getUI().render(batch);
		}
	}
	
	@Override
	public void renderContent(TacStarScreen screen) {
		
	}

}
