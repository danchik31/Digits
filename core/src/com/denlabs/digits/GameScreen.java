package com.denlabs.digits;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 * Created by dkurdamosov on 28.11.2017.
 */

public class GameScreen implements Screen {
    private Stage stage;


    public GameScreen() {

    }

    @Override
    public void show() {
        stage = new Stage();
        stage.getViewport().setWorldSize(MainGame.WORLD_WIDTH, MainGame.WORLD_HEIGHT);
        Gdx.input.setInputProcessor(stage);
        stage.addActor(new Sky());
        stage.addActor(new Cloud(100,300));
        stage.addActor(new Digit("5",140,310));
        stage.addActor(new Digit("+",350,300));
        stage.addActor(new Digit("7",400,300));
        stage.addActor(new Digit("=",450,300));

        stage.addActor(new Digit("5",450,50));
        stage.addActor(new Digit("8",500,50));
        stage.addActor(new Digit("9",550,50));

        stage.addActor(new Cloud(200,50));
        stage.addActor(new Cloud(360,50));
        stage.addActor(new Cloud(520,50));
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        stage.act();
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
