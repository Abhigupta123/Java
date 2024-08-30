// Dynamic Method Dispatch
class A {

    public void show()
    {
        System.out.println("in A show");
    }
}

class B extends A{
    public void show()
    {
        System.out.println("in B show");
    }
}

class C extends A{
    public void show()
    {
        System.out.println("in C show");
    }
}

public class Demo{
    public static void main(String s[])
    {
        A obj = new A();  // here i take same Class of A to make refernce as well as object.
        obj.show();



        obj = new B();   // Here i change the object to Class B.
        obj.show();

        obj = new C();
        obj.show();      // Here i change the object to Class C.
    }

}