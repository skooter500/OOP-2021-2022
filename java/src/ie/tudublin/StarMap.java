package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class StarMap extends PApplet {

    ArrayList<Star> stars = new ArrayList<Star>();
    
    void drawGrid()
    {
    }

    void printStars()
    {
        for(Star s:stars)
        {
            System.out.println(s);
        }
    }

    void loadStars()
    {
        Table table = loadTable("HabHYG15ly.csv", "header");
        for(TableRow r:table.rows())
        {
            Star s = new Star(r);
            stars.add(s);
        }
    }

    public void settings() {
        size(800, 800);
    }


    public void mouseClicked()
    {
        
    }

    public void setup() {
        colorMode(RGB);
        loadStars();
        printStars();
    }

    public void drawStars()
    {
    }

    public void draw() 
    {
    }
}