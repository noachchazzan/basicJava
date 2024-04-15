public class LocalVariable {
    // local variables are local to the area/block it is in and cant be access via globals
    public void getDogAge(int age){
        int dogAge = age + 12;
        System.out.println("Dog age is: "+dogAge);
    }

    public static void main(String args[]){
        LocalVariable l1 = new LocalVariable();
        l1.getDogAge(12);
        //l1.dogAge;

    }
}
