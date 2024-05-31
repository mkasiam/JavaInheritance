package E9_5;

public class Question1 {
    private String text;
    private String answer;

    public Question1(String text, String answer) {
        this.text = text;
        this.answer = answer;
    }

    public Question1() {
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
