interface Printable {
    void print();
}

interface Showable {
    void show();
}

public class DemoClass implements Printable, Showable {
    public void print() {
        System.out.println("Print method called");
    }

    public void show() {
        System.out.println("Show method called");
    }

    public static void main(String[] args) {
        DemoClass obj = new DemoClass();
        obj.print();
        obj.show();
    }
}