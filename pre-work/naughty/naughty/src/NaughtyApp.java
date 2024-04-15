import java.util.Scanner;
public class NaughtyApp {
    public static void main (String[] args) {
        // Printing main message
        System.out.println("Hello, World! Welcome to the Naughty Java Learning Program for kids.");

        byte b1 = 4;
        short s1 = 9;
        int i1 = 888;

        String[] kidsNames; // Declares an array kid names.
        kidsNames = new String[]{"Marisol", "Alba","Mia","AnnMarie", "Sasha", "Monste", "Gomer"};
        int[] kidAges = new int[] {5, 14, 10, 3, 11}; // Array of Ages
        System.out.print(kidsNames[0] + " is " + kidAges[0] + " years old.");

        boolean[] punchCard = new boolean[] {false, true, true, false};
        for (boolean b : punchCard) {
            System.out.println(b);

        }
        boolean[] punchCardII = new boolean[256];
        int[] punchCardInt = new int[256];

        for (boolean b : punchCardII) {
            System.out.println(
                    b
            );
        }
    }
}

