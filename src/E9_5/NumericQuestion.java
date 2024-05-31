package E9_5;

import java.util.Scanner;

public class NumericQuestion extends Question1 {

    final double DIFFER_VALUE;

    public NumericQuestion() {
        DIFFER_VALUE = 0.01;
    }

    @Override
    public boolean checkAnswer(String response) {
        double resultInDouble = Double.parseDouble(response);
        double actualAnswer = Double.parseDouble(getAnswer());
        if (Math.abs(actualAnswer - resultInDouble) <= DIFFER_VALUE) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Question1 question1 = new NumericQuestion();
        question1.setText("What is the result of 12 / 4 = ?");
        question1.setAnswer("3");

        question1.display();
        System.out.print("Type your Answer Please:");
        String response = in.next();
        if (question1.checkAnswer(response)) {
            System.out.println("Correct Answer.");
        } else{
            System.out.println("Wrong Answer");
        }
    }

}
