public class Array {
    public static void main(String args[]){
        String[] studentNames = new String[] {"Marisol", "Alba", "Gomer", "Lilith", "Mia"};
        int[] studentAge = new int[] {25, 32, 39, 40};
        double [] studentGrade = new double[] {4.0, 3.25, 3.0, 2.9, 3.5};
        String[] studentSubjects = new String[5];
        studentSubjects[0] = "Computer Science";
        studentSubjects[1] = "Web Development";
        studentSubjects[2] = "React/Javascript/Node.js/Express.js";
        studentSubjects[3] = "Data Bases";
        studentSubjects[4] = "Data Structures and Algorithms";

        System.out.println(studentNames[0]);
        System.out.println(studentNames[2]);
        System.out.println(studentNames[4]);
        System.out.println(studentAge[0]);
        System.out.println(studentGrade[3]);
        System.out.println(studentSubjects[0]);
    }
}
