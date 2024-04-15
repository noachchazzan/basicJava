public class StringMethod {
    public static void main (String args[]) {
        System.out.println(greet("John"));
        greet("Noach");
        greet("Sanad");
        greet("Joe");

    }
    public static String greet(String name){
        return String.format("Hello, %s, welcome to Java", name);
    }
}
