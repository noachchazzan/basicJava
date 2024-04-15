public class AcessorSetterMethod {
    public static void main(String args[]){
        Car c1 = new Car("toyota", "rav4", 2016);
        System.out.println((c1.getMake()));
        System.out.println((c1.getYear()));
        System.out.println((c1.getModel()));

        // Set to new value
        c1.setModel("Prius V");
        c1.setMake("Toyota");
        c1.setYear(2025);
        System.out.println(("After using setter methods we changed it: "));
        System.out.println((c1.getMake()));
        System.out.println((c1.getYear()));
        System.out.println((c1.getModel()));
    }
}
