interface A{
    int age = 21;
    String area = "Mumbai";
    void show();
    void config();
}
class B implements A{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in Config");
    }
}

public class Main{
    public static void main(String s[])
    {
        A obj = new B();
        obj.show();
        obj.config();

        System.out.println(A.area);
}

}