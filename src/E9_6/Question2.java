package E9_6;

public class Question2 {

    private String text;
    private String answer;

    public Question2(String text, String answer) {
        this.text = text;
        this.answer = answer;
    }

    public Question2() {
        text = "";
        answer = "";
    }

    public String getText() {
        return text;
    }

    public String getAnswer() {
        return answer;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean checkAnswer(String response) {
        return response.equals(answer);
    }

    public void display() {
        System.out.println(text);
    }
}
