class Calc{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
}

class AdvCal extends Calc{
    public int add(int n1,int n2)
    {
        return n1+n2+1;
    }
}

public class demo{
    public static void main(String s[])
    {
    AdvCal obj = new AdvCal();

    int r = obj.add(5,4);
    System.out.print(r);
    
    }
}