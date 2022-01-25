package ie.tudublin;

public class Animal
{
    private String name;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public Animal(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return name;
    }
}