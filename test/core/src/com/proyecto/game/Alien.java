package com.proyecto.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Alien {
    Texture texture = new Texture("alien.png");
    float x, y, w, h, vx, vy;
    Temporizador cambioVelocidad = new Temporizador(30);

    Alien() {
        x = 640;
        y = Utils.random.nextInt(480);
        w = 64 * 2;
        h = 48 * 2;
        vx = -2;
        vy = 0;
        this.texture = new Texture("alien.png");
    }
    {
        x = 640;
        y = Utils.random.nextInt(460);
        w = 64;
        h = 48;
        vx = -3;
        vy = 1;
        this.texture = new Texture("alien.png");
    }
    {
        x = 640;
        y = Utils.random.nextInt(440);
        w = 64;
        h = 48;
        vx = -3;
        vy = 1;
        this.texture = new Texture("alien.png");
    }
    {
        x = 640;
        y = Utils.random.nextInt(440);
        w = 64 * 2;
        h = 48 * 2;
        vx = -3;
        vy = 1;
        this.texture = new Texture("alien.png");
    }
    public void update() {
        if (texture !=null) {
            y += vy;
            x += vx;

            if (cambioVelocidad.suena()) {
                vy = Utils.random.nextInt(6) - 3;
                vx = -(Utils.random.nextInt(3) + 1);
            }
        }
    }
    void render(SpriteBatch batch) {
        if (texture != null) {
            batch.draw(texture, x, y, w, h);
        }
    }
}