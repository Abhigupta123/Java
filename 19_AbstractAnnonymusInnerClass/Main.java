abstract class A{
   abstract public void show();
   abstract public void config();

}


public class Main{
    public static void main(String s[])
    {
        A obj = new A(){
            public void show()
            {
                System.out.println("in new show");
            }
            public void config()
            {
                System.out.print("in config class");
            }
        };

        obj.show();
        obj.config();

    }
}