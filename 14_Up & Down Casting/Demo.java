class A{
    public void show1()
    {
        System.out.print("in A show");
    }
}

class B extends A{
    public void show2(){
        System.out.print("in B show");
    }
}

public class Demo{
    public static void main(String s[])
    {
        A obj = new B();
        obj.show1();

        B obj1 = (B)obj;
        obj1.show2();


        

    }
}