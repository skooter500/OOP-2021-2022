package ie.tudublin;

public abstract class GameObject {
    protected float x, y;
    protected float fx, fy;
    protected float w;
    protected float halfW;

    protected YASC yasc;

    protected float rotation;

    public GameObject(YASC yasc)
    {
        this.yasc = yasc; 
    }

    public abstract void render();
    public abstract void update();

}
