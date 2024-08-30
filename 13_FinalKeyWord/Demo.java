// Final -  Variable , Method , Class 

final class Calc{                      // Here i can make a class final so that no one can inherit my class by extends .
    public void add(int n, int m)
    {
        System.out.print(n+m);
    }
}

class B extends Calc{      // here we can see we are not able to inherit the class Calc .

}

class AdvCalc {
    public final void show()    // Here we can assign final in method , so that no one can overrride my method.
    {
        System.out.println("in AdvCalc Class");
    }
}

class C extends AdvCalc{
    public void show()     // Here we can see we are not able to override the show method 
    {
        System.out.print("in class C");
    }
}


public class Demo{
    public static void main(String s[])

    final int a =10;   // here i can make a variable as constant by just putting final key word .
    {
        Calc obj = new Calc();
        obj.add(3,4);
    }
}