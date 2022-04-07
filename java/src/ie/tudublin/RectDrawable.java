package ie.tudublin;

import processing.core.PApplet;

public class RectDrawable extends Drawable {

    public RectDrawable(PApplet pa) {
        super(pa);
    }
    
    public void render()
    {
        pa.rectMode(PApplet.CENTER);
        pa.rect(pa.width / 2, pa.height / 2, 100, 100);
    }
}
