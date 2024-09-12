@FunctionalInterface
interface A{
    void show(int n);
}


public class Main{
    public static void main(String s[])
    {
        A obj = (int n)->
            {
                System.out.print("in show " + n);
            };
        obj.show(5);
    }
}