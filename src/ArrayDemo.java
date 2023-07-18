public class ArrayDemo {
    public static void main(String[] args) {
        // 创建一个整型数组并初始化
        int[] arr = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        // 遍历数组，计算总和
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        // 输出总和
        System.out.println("数组元素的总和为：" + sum);
        // 输出数组的长度
        System.out.println("数组的长度为：" + arr.length);
    }
}