package Project.QUIZ_CONSOLE_APP;

// Here oly the 2 methods will be called
public class Main {
    public static void main(String arg[]){

        QuestionService service = new QuestionService();
        service.playQuiz();
        service.printScore();
    }
}
