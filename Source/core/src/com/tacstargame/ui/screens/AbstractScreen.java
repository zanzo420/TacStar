package com.tacstargame.ui.screens;

import box2dLight.RayHandler;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.tacstargame.TacStar;
import com.tacstargame.ui.TacStarScreen;
import com.tacstargame.ui.Ui;
import com.tacstargame.ui.UiElement;

public class AbstractScreen implements TacStarScreen {
	
	protected TacStar tacStar;
	
	protected Ui ui;
	protected UiElement background;
	protected World physic;
	protected RayHandler rayHandler;
	
	public AbstractScreen(TacStar tacStar) {
		this.tacStar = tacStar;
		physic = new World(new Vector2(0,0), true);
		rayHandler = new RayHandler(physic);
	}

	@Override
	public void render(float delta) {}

	@Override
	public void resize(int width, int height) {}

	@Override
	public void pause() {}

	@Override
	public void resume() {}

	@Override
	public void hide() {}
	
	@Override
	public void show() {}
	
	@Override
	public void update() {}

	@Override
	public void dispose() {
		background.dispose();		
	}

	@Override
	public UiElement getBackground() {
		return background;
	}

	@Override
	public Ui getUI() {
		return ui;
	}

	@Override
	public World getPhysic() {
		return physic;
	}

	@Override
	public RayHandler getRayHandler() {
		return rayHandler;
	}	
	
}
