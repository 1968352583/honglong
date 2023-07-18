import java.util.Arrays;
import java.util.Scanner;

public class MethodDemo01 {
    public static void main(String[] args) {
        //1.shuzu
        int[] arr={11,22,33,44,5,6,8,7,};
        //2.zhaomax
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println(max(arr,45));

    }
    public static boolean max(int[] arr,int a){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == a){
                 return true;
            }
        }
        return false;
    }
}
