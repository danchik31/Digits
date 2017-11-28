package com.denlabs.digits;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.EventListener;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.utils.DragListener;

/**
 * Created by dkurdamosov on 28.11.2017.
 */

public class Cloud extends Actor{
     Sprite sprite;

    public Cloud(float x, float y) {
        sprite = new Sprite(new Texture("cloud.png"));
        sprite.setPosition(x,y);
        sprite.setSize(150,100);
        setSize(150,100);
        setBounds(x,y,150,100);

this.addListener(new InputListener(){
    @Override
    public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
        return true;
    }
});
        this.addListener(new DragListener(){
            @Override
            public void touchDragged(InputEvent event, float x, float y, int pointer) {
                sprite.setPosition(x,y);
            }

        });
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        sprite.draw(batch);
    }


}
