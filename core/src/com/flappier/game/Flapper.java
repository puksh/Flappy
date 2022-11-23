package com.flappier.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.math.Rectangle;

public class Flapper extends ApplicationAdapter {
	SpriteBatch batch;
	private Texture birdTexture;
	private Sound fartSound;
	private Music happyMusic;
	private Rectangle bird;
	private OrthographicCamera camera;

	@Override
	public void create () {
		batch = new SpriteBatch();
		birdTexture = new Texture("flappier.png");

		// load the drop sound effect and the rain background "music"
		//fartSound = Gdx.audio.newSound(Gdx.files.internal("Quick Fart-SoundBible.com-655578646.mp3"));
		//happyMusic = Gdx.audio.newMusic(Gdx.files.internal("phineas-and-ferb-perry-the-platypus-theme-song.mp3"));

		//happyMusic.setLooping(true);
		//happyMusic.play();

		//camera
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 480);

		bird = new Rectangle();
		bird.x = 190;
		bird.y = 140;
		bird.width = 190;
		bird.height = 140;

	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		camera.update();
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		batch.draw(birdTexture, bird.x, bird.y);
		batch.end();


		if(Gdx.input.isTouched()) {
			Vector3 touchPos = new Vector3();
			touchPos.set(Gdx.input.getX(), Gdx.input.getY(), 0);
			camera.unproject(touchPos);
			bird.y = touchPos.y - 140 / 2;
		}

		if(bird.x < 0) bird.x = 0;
		if(bird.x > 800 - 190) bird.x = 800 - 190;

	}

	@Override
	public void dispose () {
		batch.dispose();
		birdTexture.dispose();
	}
}
