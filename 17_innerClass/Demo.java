class A{
    public void show()
    {
        System.out.println("In class A");
    }


    class B{                                 // Non-static class
        public void config()
        {
            System.out.println("In class B");
        }

    static class C{          // Static class
            public void show1()
            {
                System.err.println("In class C");
            }
    }
    }

    
}



public class Demo{
    public static void main(String s[])
    {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B(); // you can use this to access the inner class when it is non-static
        obj1.config();

        A.B.C obj2 = new A.B.C();  // you can use this to access the inner class when it is Static
        obj2.show1();

    }
}