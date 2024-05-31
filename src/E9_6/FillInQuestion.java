package E9_6;

import java.util.Scanner;

public class FillInQuestion extends Question2{

    @Override
    public void setText(String text) {
        super.setText(text + " ____");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Question2 question2 = new FillInQuestion();
        question2.setText("Who is the Inventor of Java?");
        question2.setAnswer("James Gosling");

        question2.display();
        String response = in.nextLine();
        if (question2.checkAnswer(response)) {
            System.out.println("Correct Answer.");
        } else{
            System.out.println("The Inventor of Java was"+ " __" + question2.getAnswer() + "__");
        }

    }
}
