package com.tacstargame.ui;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.tacstargame.input.InputListener;
import com.tacstargame.input.InputObservable;
import com.tacstargame.rendering.Renderable;

public interface UiElement extends Renderable, InputListener, InputObservable {
	boolean isMouseOver();
	void render(SpriteBatch batch, Vector2 origin);
}
