package ie.tudublin;

public class Bullet extends GameObject {
    public Bullet(YASC yasc, float x, float y, float rotation)
    {
        super(yasc);
        this.x = x;
        this.y = y;
        this.rotation = rotation;
    }

    @Override
    public void render() {
     yasc.pushMatrix();
     yasc.translate(x, y);
     yasc.rotate(rotation);
     yasc.line(0, -5, 0, 5);   
     yasc.popMatrix();
    }

    @Override
    public void update() {
        fx = YASC.sin(rotation);
        fy = - YASC.cos(rotation);
        x += fx * 5;
        y += fy * 5;    
    }
}
