package com.tacstargame.ui.element;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Vector2;
import com.tacstargame.input.KeyBindings;
import com.tacstargame.input.KeyListener;
import com.tacstargame.ui.util.Measure;

public class UiEditBox extends UiElementImpl {
	
	private UiLabel label;

	public UiEditBox(Vector2 position, Measure measure) {
		super(position, measure);
		label = new UiLabel("", new Vector2(0,0));
		addKeyListener(new EditBoxKeyListener());
	}

	@Override
	public void render(SpriteBatch batch, Vector2 origin) {
		batch.end();
		shapeRender.setColor(Color.BLACK);
		shapeRender.begin(ShapeType.Filled);
		shapeRender.rect(origin.x + position.x, origin.y + position.y, measure.width, measure.height);
		shapeRender.end();
		batch.begin();
		label.render(batch, origin.cpy().add(position));
	}

	@Override
	public void dispose() {}

	@Override
	public void update() {}
	
	private class EditBoxKeyListener implements KeyListener {

		@Override
		public void onKeyDown(int keyCode) {
			if (keyCode == KeyBindings.BACK && label.getText().length() != 1) {
				label.setText(label.getText().substring(0, label.getText().length() - 2));
			}
			if (keyCode == KeyBindings.ENTER) {
				selected = false;
			}
		}

		@Override
		public void onKeyUp(int keyCode) {

		}

		@Override
		public void onKeytyped(char character) {
			if (selected) {
				label.setText(label.getText() + character);	
			}			
		}
		
	}

}
