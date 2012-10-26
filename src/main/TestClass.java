package main;

/**
 *
 * @author Babu
 */
public class TestClass {

    private final int number;
    private final String text;

    public TestClass(int number, String text) {
        this.number = number;
        this.text = text;
    }
  
    //GETTERS AND SETTERS-------------------------------------------------------

    public int getNumber() {
        return number;
    }

    public String getText() {
        return text;
    }       

    @Override
    public String toString() {
        return "number:" + number+" text: "+text;
    }
}
