package ie.tudublin;

public class Player 
{
    float x, y;
    float w;
    float halfW;

    YASC yasc;

    public Player(float x, float y, float w, YASC yasc)
    {
        this.x = x;
        this.y = y;
        this.w = w;
        halfW = w / 2.0f;
        this.yasc = yasc;
    }

    void render()
    {
        float halfW = w / 2;
        yasc.stroke(255);
        yasc.line(x - halfW, y + halfW, x, y - halfW);
        yasc.line(x, y - halfW, x + halfW, y + halfW);
        yasc.line(x + halfW, y + halfW, x, y);
        yasc.line(x, y, x - halfW, y + halfW);
    }

}
