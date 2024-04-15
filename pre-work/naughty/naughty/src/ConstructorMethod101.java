public class ConstructorMethod101 {
    // constructor method
    public ConstructorMethod101() {
        System.out.println("This is a constructor method");
    }
    public ConstructorMethod101(String param){
        System.out.println("This is a constructor method with parameter"+param);

    }

    // instance method
    public void InstanceMethod() {
        System.out.println("This is an instance method!");
    }
}

class ConstructorMethodExample {
    public static void main(String args[]){
        // create obj method with default constructor
        ConstructorMethod101 method1 = new ConstructorMethod101();
        method1.InstanceMethod();
// create obj method2 wth constrctor having parameter
        ConstructorMethod101 method2 = new ConstructorMethod101(" with params");
        method2.InstanceMethod();
    }
}