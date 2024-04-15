public class InstanceVariables {
    // Instance variables are per instance and gives access to other things
    String name;
    int age;

    public InstanceVariables(String name){
        this.name = name;
    }

    // Set age
    public void setAge(int age){
        this.age = age;
    }

    // Display Info
    public void displayInfo(){
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
    }

    public static void main(String args[]){
        InstanceVariables l1 = new InstanceVariables("Dan");
        l1.setAge(21);
        l1.displayInfo();
        System.out.println(l1.age);
    }
}
