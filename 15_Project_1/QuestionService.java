import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String selection []= new String[5];

    public QuestionService(){
        questions[0] = new Question(1,"size of int","1","2","3","4","4");
        questions[1] = new Question(2,"size of float","1","2","3","4","4");
        questions[2] = new Question(3,"size of boolean","1","2","3","4","1");
        questions[3] = new Question(4,"size of char","1","2","3","4","2");
        questions[4] = new Question(5,"size of double","1","2","3","8","8");
    }

    public void playQuize()
    {
        int i=0;
        for(Question q : questions)
        {
            System.out.println("Question no." + q.getId() );
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());


            Scanner sc = new Scanner(System.in);
            
            selection[i] = sc.nextLine();
            i++;
        }
        for(String s: selection)
        {
            System.out.println(s);
        }
    }


    public void calculateAns()
        {
            int Score = 0;
            for(int i=0;i<questions.length;i++)
            {
            Question que = questions[i];
            String ActualAns = que.getAns();
            String UserAns = selection[i];

            if(ActualAns.equals(UserAns))
                Score++;
            }
            System.out.print("Your Score is " + Score);       
            
        }
    

}
