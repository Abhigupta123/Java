// Constructor
class Human{
    int age;
    String name;

    public Human(){          // Default Constructor
        age=15;
        name="Abhi";
    }

    public Human(int age , String name)       // Parametrize Constructor
    {
        this.age = age;
        this.name = name;
    }
}



public class test7{
    public static void main (String s[])
    {
        Human h1 = new Human();
        Human h2 = new Human(12,"sanu");

        System.out.print(h1.name + ":" + h1.age);
        System.out.print(h2.name + ":" + h2.age);
    }
}