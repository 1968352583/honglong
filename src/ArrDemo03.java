import java.util.Random;

public class ArrDemo03 {
    public static void main(String[] args) {
        //1.arr
        Random r = new Random();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        //2.change
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            int ran = r.nextInt(arr.length);
            number = arr[i];
            arr[i] = arr[ran];
            arr[ran] = number;
        }
        //3.print
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
