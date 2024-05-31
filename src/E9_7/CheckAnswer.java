package E9_7;

import java.util.Scanner;

public class CheckAnswer extends Question3{

    @Override
    public boolean checkAnswer(String response) {
        String answerInLowerCase = getAnswer().toLowerCase();
        String responseInLowerCase = response.toLowerCase();
        if (responseInLowerCase.equals(answerInLowerCase)){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Question3 question3 = new CheckAnswer();

        question3.setText("Who is the Inventor of Java?");
        question3.setAnswer("James Gosling");
        question3.display();

        String response = in.nextLine();
        if (question3.checkAnswer(response)) {
            System.out.println("Correct Answer.");
        } else{
            System.out.println("The Inventor of Java was"+ " __" + question3.getAnswer() + "__");
        }
    }
}
