package com.denlabs.digits;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class MainGame extends Game {

    public static final float WORLD_WIDTH = 800;
    public static final float WORLD_HEIGHT = 480;

    @Override
    public void create() {

        setScreen(new GameScreen());
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {

    }


}
