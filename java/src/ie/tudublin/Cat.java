package ie.tudublin;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world");

        Animal misty = new Animal("Misty");
        Animal lucy = new Animal("Lucy");

        lucy = misty;
        misty.setName("Tara");


        System.out.println(misty);
        System.out.println(lucy);

        Cat ginger = new Cat("Ginger");

        System.out.println(ginger);

        // to show code works -- if less than 0 print dead
        for (int i = 0; i < 9; i++) {
            ginger.kill();
        }

        // Tara Misty
        // Tara Tara
        
    }
}