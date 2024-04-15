public class ForLoopInArrays {
    public static void main(String ars[]) {
        double[] numList = {1000, 121.9, 404, 202,9, 304.5, 111.111, 222.222, 333.333};
        // Print all the array elements:
        for (int i = 0; i < numList.length; i++) {
            System.out.println(numList[i]);
        }
        // below sums the values into double variable sum:
        double sum = 0;
        for (int i=0;i< numList.length;i++) {
            sum += numList[i];
        }
        System.out.println(sum);

        // FInd the largest element of an array
        double max = numList[0]; // Initializing the 1st element to the largest element
        for (int i=0; i < numList.length; i++) {
            if (numList[i] > max) {
                max = numList[i];
            }
        }
        System.out.println("Largest element in array is: " + max);
    }
}
