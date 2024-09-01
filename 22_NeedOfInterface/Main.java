interface Computer{
    void code();
}


class Laptop implements Computer{
    public void code()
    {
        System.out.println("Coding....");
    }
}

class Desktop implements Computer {
    public void code(){
        System.out.println("Coding...,Compile....,Run....");
    }
}
class Developer{
    public void dev(Computer comp)
    {
        comp.code();
    }
}


public class Main{
    public static void main(String s[])
    {
        Computer lap =  new Laptop();
        Computer des = new Desktop();

        Developer sanu = new Developer();

        sanu.dev(lap);

    }
}