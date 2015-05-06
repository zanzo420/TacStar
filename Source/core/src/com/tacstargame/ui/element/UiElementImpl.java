package com.tacstargame.ui.element;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.tacstargame.input.KeyEvent;
import com.tacstargame.input.KeyListener;
import com.tacstargame.input.MouseEvent;
import com.tacstargame.input.MouseListener;
import com.tacstargame.ui.UiElement;
import com.tacstargame.ui.util.Measure;

public abstract class UiElementImpl implements UiElement {
	
	protected Vector2 position;
	protected Measure measure;
	protected boolean visible;
	protected boolean mouseOver;
	
	protected List<MouseListener> mouseListener;
	protected List<KeyListener> keyListener;
	
	public UiElementImpl(Vector2 position, Measure measure) {
		this.position = (position != null) ? position : new Vector2(0,0);
		this.measure = (measure != null) ? measure : new Measure(0, 0);
		visible = true;
		mouseListener = new ArrayList<MouseListener>();
	}

	@Override
	public Vector2 getPosition() {
		return position;
	}

	@Override
	public void setPosition(Vector2 position) {
		this.position = (position != null) ? position : new Vector2(0,0);	
	}

	@Override
	public Measure getMeasure() {
		return measure;
	}

	@Override
	public void setMeasure(Measure measure) {
		this.measure = (measure != null) ? measure : new Measure(0, 0);
		
	}

	@Override
	public void setVisible(boolean visible) {
		this.visible = visible;		
	}

	@Override
	public boolean isVisible() {
		return visible;
	}

	@Override
	public void keyInput(KeyEvent event, int keyCode) {
		for (KeyListener listener : keyListener) {
			switch (event) {
			case PRESS:
				listener.onKeyDown(keyCode);
				break;
			case RELEASE:
				listener.onKeyUp(keyCode);
				break;
			}
		}
		
	}

	@Override
	public void mouseInput(MouseEvent event, int button, Vector2 position) {
		for (MouseListener listener : mouseListener) {
			switch (event) {
			case MOVE:
				listener.onMouseMove(position);
				mouseOver = isMouseOver(position);
				break;
			case PRESS:
				listener.onMousePress(button, position);
				break;
			case RELEASE:
				listener.onMouseRelease(button, position);
				break;
			}
		}
		
	}

	@Override
	public void render(SpriteBatch batch) {
		if (!visible)
			return;
	}

	@Override
	public void addMouseListener(MouseListener listener) {
		mouseListener.add(listener);		
	}

	@Override
	public void addKeyListener(KeyListener listener) {
		keyListener.add(listener);
	}
	
	private boolean isMouseOver(Vector2 position) {
		if (position.x >= getPosition().x &&
				position.x <= getPosition().x + getMeasure().width &&
				position.y * -1 + Gdx.graphics.getHeight() >= getPosition().y &&
				position.y * -1 + Gdx.graphics.getHeight() <= getPosition().y + getMeasure().height) {
			return true;
		}
		return false;
	}


	@Override
	public boolean isMouseOver() {
		return mouseOver;
	}


}
