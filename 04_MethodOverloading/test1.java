class task{
    public void song()
    {
        System.out.println("Chl Chaiyaan chaiyaan chaiyaan chaiyaan ......");
    }

    public String shop(int cost)
    {
        if(cost >=10)
        return "glacier Pen";
        else
        return "No Pen at this cost";
    }
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
    public int add(int n1, int n2, int n3)
    {
        return n1+n2+n3;
    }
}



public class test1{
    public static void main(String s[])
    {
        task t = new task();
        t.song();
        String result = t.shop(10);
        System.out.println(result); 

        int ans = t.add(5,3 ,6);
        System.out.println(ans);
    }
}