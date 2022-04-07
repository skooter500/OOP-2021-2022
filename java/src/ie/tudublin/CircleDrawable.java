package ie.tudublin;

import processing.core.PApplet;

public class CircleDrawable extends Drawable {

    public CircleDrawable(PApplet pa) {
        super(pa);
    }
    
    public void render()
    {
        pa.circle(pa.width / 2, pa.height /2, 100);
    }
}
