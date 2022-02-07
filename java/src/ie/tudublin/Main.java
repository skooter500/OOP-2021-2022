package ie.tudublin;

public class Main
{

<<<<<<< HEAD
    public static void main()
=======
    public static void bugZap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new BugZap());
    }

    public static void loops()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Loops());
    }

    public void cat()
>>>>>>> 32791f4ad6e914917f1724d84f8fb44506699232
    {
        System.out.println("Hello world");

        Animal misty = new Animal("Misty");
        Animal lucy = new Animal("Lucy");

        lucy = misty;
        misty.setName("Tara");

        System.out.println(misty);
        System.out.println(lucy);

        
        Cat cat = new Cat("Ginger");

        while(cat.getNumLives() > 0)
        {
            cat.kill();
        }
        cat.kill();

<<<<<<< HEAD
    }   
=======
    }
    public static void main(String[] args)
    {
        bugZap();

        // Tara Misty
        // Tara Tara
        
    }
>>>>>>> 32791f4ad6e914917f1724d84f8fb44506699232
}