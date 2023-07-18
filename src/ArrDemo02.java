import java.util.Random;
public class ArrDemo02 {
    public static void main(String[] args) {
        Random r = new Random();
        int sum = 0;
        // Generate random numbers and store them in an array
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int ran = r.nextInt(100) + 1;
            arr[i] = ran;
            System.out.print(arr[i] + "\t");
        }
        // Calculate the sum of the numbers in the array
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("和是" + sum);
        // Calculate the average of the numbers in the array
        int ave = sum / arr.length;
        System.out.println("平均数为" + ave);
        // Count the number of elements in the array that are less than the average
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (ave > arr[i]) {
                count++;
            }
        }
        System.out.println("有" + count + "个比平均值小");
    }
}