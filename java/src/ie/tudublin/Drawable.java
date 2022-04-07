package ie.tudublin;

import processing.core.PApplet;

public abstract class Drawable {
    PApplet pa;

    public Drawable(PApplet pa) {
        this.pa = pa;
    }

    abstract public void render();    
}
