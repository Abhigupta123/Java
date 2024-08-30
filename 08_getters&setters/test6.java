class Human{
    private int age;

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }
    
}


public class test6{
    public static void main(String s[])
    {
        Human h1 = new Human();
        h1.setAge(23);

        System.out.print(h1.getAge());
    }
}