@FunctionalInterface
interface A{
    void show();
}


public class Main{
    public static void main(String s[])
    {
        A obj = new A(){
            public void show()
            {
                System.out.print("in show");
            }
        };
        obj.show();
    }
}