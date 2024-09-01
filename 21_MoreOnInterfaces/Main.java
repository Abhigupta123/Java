// class to class  ----> extends
// interface to class ----> implements
// interface to interface -----> extends

interface A{
    void show();
    void config();

}

interface X{
    void run();
}
interface Y extends X{
   

}

class B implements A,Y{
    public void show()
    {
        System.out.print("in Show");
    }
    public void config()
    {
        System.out.print("in config");
    }
    public void run()
    {
        System.out.println("in Run");
    }
   
}

public class Main{
    public static void main(String s[])
    {
        A obj = new B();
        obj.show();
        obj.config();

        Y obj1 = new B();

        obj1.run();

    }
}