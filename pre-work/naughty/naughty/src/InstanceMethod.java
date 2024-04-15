class NKid {
        public void name_of_kid(String name){
            System.out.println(String.format("Kid name is: %s", name));
        }  // Name of kid
        public void age(double age){
            System.out.println(String.format("Kids age as percentage of whole number is:  %.2f", age));
        }
        public static void className(String name){
            System.out.println(String.format("Object name is: %s", name));
        }
}
public class InstanceMethod { public static void main(String args[]){
        NKid kid1 =  new NKid(); // create kid1 object
        NKid kid2 = new NKid();
        NKid kid3 = new NKid();
        kid1.name_of_kid("monste");
        kid1.age(5);
        kid1.className("Kid");
        NKid.className("NKid object -- static"); // You do not have to create an object hereinstance methods require object creation and with static methods you can overwrite things so...when it comes to oop and static methods unless you know it is not going to change a lot and it is special thendon't use static methods.
        kid1.name_of_kid("alba");
        kid1.age(12);
        kid1.name_of_kid("marisol");
        kid1.age(7);
    }
}