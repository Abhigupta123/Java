@FunctionalInterface
interface A{
    int add(int n1, int n2);
}


public class Main{
    public static void main(String s[])
    {
        A obj = (int n1,int n2)->
            {
                return n1+n2;
            };
       int ans =  obj.add(5,8);
       System.out.println(ans);
    }
}