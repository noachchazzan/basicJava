/* constructor method: default method of the class that will be run at the time when the
* object is created or instantiated.
* is used to declare default behavior for all objects, name must be the same as the class name,
* must have explicit return type.
*
* 2 types:
* 1. default constructor (no-arg constructor)
* 2. parameterized constructor
* */
class Customer {
    // constructor method
    public Customer() {
        System.out.println("Welcome to the Grocery Outlet!");
    }

    // Instance method to get customer name
    public void getName(String name) {
        System.out.println("Customer name is "+name);
    }
}

public class ConstructorMethod {
    public static void main(String[] args){
        Customer customer1 = new Customer();//create obj from customer class
        customer1.getName("Marisol"); // get name for customer1

        Customer customer2 = new Customer();//create obj from customer class
        customer1.getName("Alba"); // get name for customer1
    }
}
/*
public  class ConstructorMethod {
    public ConstructorMethod(){
        // constructor method  with no params
        System.out.println("This is a constructor");
    }
    public void ConstructorMethod(String param) {
// constructor method with params
        System.out.println("This is a constructor with parameter");
    }

    public void InstanceMethod(){
        //instance method
        System.out.println("This is an instance method");
    }
}*/