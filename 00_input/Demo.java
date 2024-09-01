import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

public class Demo{
    public static void main(String s[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your thought");

        String thought = sc.nextLine();

        System.out.println("My Thought is :" + thought);

        System.out.println("What's your name");

        String name = sc.nextLine();

        System.out.println("Where You are going for next Trip");

        String TripPlace = sc.nextLine();

        System.out.println("When you are going for " + TripPlace);

        String TripDate = sc.nextLine();

        System.out.println("Are you going "+TripPlace +" on "+ TripDate + " with your family or Friends");

        String whom = sc.nextLine();

        System.out.println("OK "+ " So " +name+ " you are going to "+ TripPlace + " with "+whom+" On "+TripDate+" Nice....Happy Journey !!!");

        sc.close();
         
    }
}