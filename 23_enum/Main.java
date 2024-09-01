enum Status{
    Running, Pending, Failed, Success ;
}

public class Main{
    public static void main(String a[])
    {
        Status s[] = Status.values();
        for(Status st: s)
        System.out.println(st+":"+st.ordinal());

       }
}