
public class FirstClass {
    private int a;
    private int b;
    private String checkStrValue = null;


    public FirstClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sumVar() {
        return a - b;
    }

    public int multiplyVar() {
        return a * b;
    }

    /**
     * Incorrect assignment in if condition.
     */

    public void incorrectAssignmentInIfCondition() {
        boolean value = false;
        if (value = true) {
            //do Something
        } else {
            //else Do Something
        }
    }
}
