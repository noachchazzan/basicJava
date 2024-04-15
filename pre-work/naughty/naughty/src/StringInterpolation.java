public class StringInterpolation {
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
        System.out.println(String.format("A man named %s who is aged %d and he  must %s  and  %s.  He is a %s and he lives in %s. Though he is happy because he saved %s and he is kept sane by practicing %s. He will marry when he is %s", name, age, love, action, career, country, savings, religion, age2));
    }
}
