package com.denlabs.digits;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by dkurdamosov on 28.11.2017.
 */

public class Sky extends Actor {
    Sprite sprite;

    public Sky() {
        sprite = new Sprite(new Texture("sky.jpg"));
        sprite.setSize(MainGame.WORLD_WIDTH,MainGame.WORLD_HEIGHT);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        sprite.draw(batch);
    }
}
