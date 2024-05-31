package E9_8;

import java.util.ArrayList;

public class ChoiceQuestion4 extends Question4{

    private ArrayList<String> choices;

   public ChoiceQuestion4() {
       choices = new ArrayList<String>();
   }

    public void addChoice(String choice, boolean correct) {
        choices.add(choice);

        if (correct) {
            String choiceString = "" + choices.size();
            setAnswer(choiceString);
        }

    }

    @Override
    public void display() {
        super.display();

        for (int i = 0; i < choices.size(); i++) {
            System.out.println((i + 1) + " " + choices.get(i));
        }

    }
}
