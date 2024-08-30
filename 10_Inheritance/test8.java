import tools.VeryAdvCal;

public class test8{
    public static void main(String s[])
    {
        VeryAdvCal obj1 = new VeryAdvCal();

       int r1= obj1.add(10,5);
        int r2=obj1.sub(5,3);

        int r3 = obj1.mult(2,3);
        int r4 = obj1.div(10,5);
        
        double r5 = obj1.power(4,2);

        System.out.print(r1 + " "+ r2 + " " + r3 + " "+ r4 + " " + r5);
    }
}