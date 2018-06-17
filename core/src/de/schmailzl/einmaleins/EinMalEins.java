package de.schmailzl.einmaleins;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import de.schmailzl.einmaleins.Screens.MenuScreen;

public class EinMalEins extends Game {

	public SpriteBatch batch;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		setScreen(new MenuScreen(this));
	}

	@Override
	public void render () {
        super.render();
	}

	@Override
    public void dispose(){
	    super.dispose();
    }
}
