package Project.QUIZ_CONSOLE_APP;

import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String selection[] = new String[5];

// ===============================
    public QuestionService(){
        questions[0] = new Question(1,"1.Which is developed by sun micro system ? ","java","CPP","Python","C","Java");
        questions[1] = new Question(2,"2._______ is the smallest unit of data in a computer ? ","Gigabyte","Bit","Byte","Terabyte","Bit");
        questions[2] = new Question(3,"3.Which of the following is NOT an anti-virus software ? ","Avast","Linux","Norton","Kas","Linux");
        questions[3] = new Question(4,"4.Which unit of the computer is considered as the brain of the computer ? ","Memory unit","Input unit","CPU","Output unit ","CPU");
        questions[4] = new Question(5,"5.In the context of computing, a byte is equal to _____ bits ? ","4","16","24","8","8");
    }

// =================================
    public void playQuiz(){
        int i =0;
        for(Question q : questions ){
            System.out.println(q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());


            try (Scanner sc = new Scanner(System.in)) {
                selection[i] = sc.nextLine();
            }
            i++;

        }
        for(String s : selection){
            System.out.println(s);
        }
    }

    //===================================
    // public void printScore() {
    //     int score = 0;

    //     for (int i=0;i<questions.length;i++) {
    //         Question[] que = new Question[i];
    //         String actualanswer = que.getAnswers[i];

    //         String useranswer = selection[i];

    //         if (actualanswer.equals(useranswer)) {
    //             score++;
    //         }

    //     }
    //     System.out.println("Your score " + score);
    // }
}
