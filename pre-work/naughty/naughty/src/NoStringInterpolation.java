public class NoStringInterpolation {
    public static void main(String args[]) {
        String name = "Noach";
        int age = 29;
        String action = "pray";
        String career = "software engineer";
        String country = "Israel";
        double savings = 134343.33;
        String love = "work";
        String religion = "Judaism";
        int age2 = 45;

        // No String Interpolation:
        System.out.println("A man named " + name + " who is aged " + age + " must " + action + " and " + love + ".  He is a " + career + " and he lives in " + country + ". Though he is happy because he saved: " + savings + " and he is kept sane by practing " + religion);
        System.out.println("He will marry when he is "+age2);
    }

}
