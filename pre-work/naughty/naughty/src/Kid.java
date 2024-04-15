// Static Method: Methods that can be called and executed without creating
// an object or instantiation of the main class.
public class Kid {
    public static void main(String args[]){
        // call static methods, just call it when ever you want without creating an object.
        name_of_kid("marisol");
        bark();
        ask();
        name_of_kid("monste");
    }
    public static void name_of_kid(String name) {
        System.out.println(String.format("Name is %s! ", name));
    }

    public static void bark() {
        System.out.println("Mi es muy rica!");
    }

    public static void ask() {
        System.out.println("Mi es rica pappi?");
    }

    public static void eat() {
        System.out.println("I am eating!");
    }
}
