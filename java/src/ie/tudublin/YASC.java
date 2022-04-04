package ie.tudublin;

import processing.core.PApplet;

public class YASC extends PApplet
{

   Player p;


    public void setup()
    {
        p = new Player(100, 100, 50, this);
    }

    public void settings()
    {
        size(500,500);
    }

    public void draw()
    {
        background(0);

        p.render();	
    }    
}
