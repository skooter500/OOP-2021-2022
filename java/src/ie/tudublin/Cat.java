package ie.tudublin;

public class Cat {

    private Integer numLives = 9;
    private String name;

    public Cat(String name)
    {
        this.name = name;
    }

    public void kill()
    {
        this.numLives = this.numLives -1;

        if (this.numLives > 0) {
            System.out.println("Ouch!");
        }
        else{
            System.out.println("Dead");
        }
    }

    public String toString()
    {
        return name;
    }
    
}
