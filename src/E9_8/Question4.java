package E9_8;

public class Question4 {

    private String text;
    private String answer;

    public Question4(String text, String answer) {
        this.text = text;
        this.answer = answer;
    }

    public Question4() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void display() {
        System.out.println(text);
    }

    public boolean checkAnswer(String response) {
        return response.equals(answer);
    }
}
