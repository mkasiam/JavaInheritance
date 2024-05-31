package E9_16;

public class LabeledPoint {
    private int x, y;
    private String label;
    public LabeledPoint(int x, int y, String label){
        this.x = x;
        this.y = y;
        this.label = label;
    }
    public LabeledPoint() {
        x = 0;
        y = 0;
        label = "";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString(){
        System.out.println("X: " + getX());
        System.out.println("Y: " + getY());
        System.out.println("Label: " + getLabel());
        return "";
    }

    public static void main(String[] args) {
        LabeledPoint labeledPoint = new LabeledPoint(5,5,"Triangle");
        labeledPoint.toString();
    }
}
