public class AnyConditionalExpression {
    public static void main (String args[]) {
        double grade = 3.67;

        if (grade == 4.0) {
            System.out.println("You are an awesome student");
        } else if (grade >= 3.5 && grade < 4.0) {
            System.out.println("You are an A grade student");
        } else if (grade >=  3.0 && grade < 3.5) {
            System.out.println("You are B grade student");
        } else if (grade >= 2.5 && grade < 3.0) {
            System.out.println("You are a poor student");
        } else {System.out.println("You failed the class");}
    }
}
