package oop;

public class Rectangle {

    private int width;
    private int length;

    // Constructor
    public Rectangle() {
        width = 10;
        length = 15;
    }

    // Parameterized Constructor
    public Rectangle(int w, int l) {
        width = w;
        length = l;
    }

    // Copy Constructor
    public Rectangle(Rectangle obj1) {
        width = obj1.width;
        length = obj1.length;
    }

    // Setter
    public void setWidth(int w) {
        if (w > 0)
            width = w;
    }

    public void setLength(int l) {
        if (l > 0)
            length = l;
    }

    // Getter
    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

}
