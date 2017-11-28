package com.denlabs.digits;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by dkurdamosov on 28.11.2017.
 */

public class Digit extends Actor {
    Sprite sprite;


    public Digit( String name, float x, float y) {


        TextureAtlas atlas = new TextureAtlas("digits.atlas");
        sprite = atlas.createSprite(name);
        sprite.setPosition(x,y);
        setPosition(x,y);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        sprite.draw(batch);
    }
}
