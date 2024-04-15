public class AccessorGetterMethod {
    public static void main(String args[]){
        Automobile a1 = new Automobile("ford", "f-350", 2025);
        System.out.println(a1.getMake());
        System.out.println(a1.getYear());
        System.out.println(a1.getModel());
    }
}
