import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

public class test {
    public static void main (String s[])
    {
        Scanner sc = new Scanner(System.in);


        System.out.println("Please enter any string (Word) without space");
        String word = sc.next();
        System.out.println("The Word is: "+word);

        System.out.println("Please enter any integer");
        int id = sc.nextInt();
        System.out.println("The integer is: "+id);

        sc.nextLine();   // Consume the leftover newline 

        System.out.print("Please enter any String ");
        String thought = sc.nextLine();
        System.out.println("The string is: "+thought);

        sc.close();

    }
}
