class A{
    public void show()
    {
        System.out.println("In class A");
    }
}


public class Main {
    public static void main(String s[])
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("In new Class");
            }
        };
        obj.show();

    }
}
