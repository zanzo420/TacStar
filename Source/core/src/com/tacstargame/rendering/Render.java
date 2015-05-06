package com.tacstargame.rendering;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Disposable;
import com.tacstargame.rendering.util.RenderSettings;
import com.tacstargame.ui.TacStarScreen;

public abstract class Render implements Disposable {
	
	protected SpriteBatch batch;
	protected OrthographicCamera camera;
	
	protected boolean renderBackground = true;
	protected boolean renderContent = true;
	protected boolean renderLight = false;
	protected boolean renderUI = true;
	
	protected RenderSettings renderSettings;
	
	public Render(RenderSettings renderSettings) {
		this.renderSettings = renderSettings;
		batch = new SpriteBatch();
		camera = new OrthographicCamera();
		camera.setToOrtho(false, renderSettings.getResolution().width, renderSettings.getResolution().height);
		camera.update();
		//batch.setProjectionMatrix(camera.combined);
	}
	
	public abstract void render(TacStarScreen screen);
	public abstract void renderBackground(TacStarScreen screen);
	public abstract void renderLight(TacStarScreen screen);
	public abstract void renderUI(TacStarScreen screen);
	public abstract void renderContent(TacStarScreen screen);
	
	@Override
	public void dispose() {
		batch.dispose();
		
	}
}
