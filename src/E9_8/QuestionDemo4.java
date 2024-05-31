package E9_8;

import chapter9_question.ChoiceQuestion;

import java.util.Scanner;

public class QuestionDemo4 extends ChoiceQuestion4 {
    public static void main(String[] args) {
        ChoiceQuestion4 first = new ChoiceQuestion4();
        first.setText("What was the original name of the Java language?");
        first.addChoice("*7", false);
        first.addChoice("Duke", true);
        first.addChoice("Oak", true);
        first.addChoice("Gosling", false);

        presentQuestion(first);
    }
    public static void presentQuestion(ChoiceQuestion4 q)
    {
        q.display();
        System.out.print("Your answer: ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
    }
}
