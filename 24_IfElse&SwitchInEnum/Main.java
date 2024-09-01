enum Status{
    Running, Pending, Failed, Success;
}


public class Main{
    public static void main(String s[])
    {
        Status st = Status.Running;

        // Switch

        switch(st){
            case Running:
            System.out.println("All good");
            break;

            case Pending:
            System.out.println("Please wait");
            break;

            case Failed:
            System.out.println("try Again");
            break;

            case Success:
            System.out.println("hurrreeyyy");
            break;


        }




        // IF Else


        // if(st == Status.Running)
        // System.out.println("All good");
        // else if(st == Status.Pending)
        // System.out.println("Please wait");
        // else if(st == Status.Failed)
        // System.out.println("try Again");
        // else
        // System.out.println("hurrreeyyy");
        
    }
}