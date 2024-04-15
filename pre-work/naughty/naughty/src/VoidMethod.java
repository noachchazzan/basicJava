public class VoidMethod {
    public static void main (String args[]) {
        greet("John");
        greet("Noach");
        greet("Sanad");
        greet("Joe");

    }

    public static void greet(String name){
        System.out.println(String.format("Hello, %s", name));
    }
}
