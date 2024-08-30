// Encapsulation

class Human{
    private int age;
    private String name;

    public int getAge()         // We can use any name instead of getAge 
    {
        return age;
    }
    public String getName()
    {
        return name;
    }

    public void setAge(int a)
    {
        age = a;
    }
    public void setName(String s){
        name = s;
    }

}


public class test5{
    public static void main(String s[])
    {
        Human h1 = new Human();
       // h1.age=17;
       h1.setAge(18);
       h1.setName("Abhi");
        System.out.print(h1.getAge() + ":" + h1.getName());
    }
}