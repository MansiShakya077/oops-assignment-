public class MyClass {
    private int myNumber;
    private String myString;
    public MyClass() {
        myNumber = 0;
        myString = "Hello, World!";
    }

    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        System.out.println("Default number: " + myObject.myNumber);
        System.out.println("Default string: " + myObject.myString);
    }
}

