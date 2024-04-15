public class StaticVariables {
    public static String name;
    public static String address;
    static double balance;
}
// used through out the class and expected to be used as such in normal way
class StaticVariablesmethod {
    public static void main(String args[]) {
        StaticVariables.name = "Danny";
        StaticVariables.address = "1212 California Avenue, Richmond, VA 22601";
        System.out.println(StaticVariables.name);
        System.out.println(StaticVariables.address);

        StaticVariables.name = "John";
        StaticVariables.address = "810 Cuckold Avenue, Richmond, VA 22602";
        System.out.println(StaticVariables.name);
        System.out.println(StaticVariables.address);
        StaticVariables.balance = 2500;
        System.out.println(StaticVariables.balance);
    }
}