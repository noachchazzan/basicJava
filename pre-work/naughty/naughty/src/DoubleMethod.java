public class DoubleMethod {

    public static void main(String[] args) {
        double sum = 0;
        sum = add(3,3);
        System.out.println(sum + " is the sum the even status is: " + isEven(sum));

    }

    // Method that does the addition of two ints
    public static double add(int num1, int num2){
        return num1 + num2;
    }

    public static boolean isEven(double number) {
        return number % 2 == 0;
    }
}
