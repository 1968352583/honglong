import java.security.SecureRandom;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 提示用户输入猜拳
        System.out.println("请输入你的猜拳：");
        // 生成随机数
        SecureRandom random = new SecureRandom();
        String[] guess = {"剪刀", "石头", "布d"};
        int computerChoice = random.nextInt(3);
        String computerGuess = guess[computerChoice];
        // 打印计算机的猜拳
        System.out.println(computerGuess);
        // 获取用户输入
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.next();
        // 判断胜负
        if (Objects.equals(userChoice, computerGuess)) {
            System.out.println("平局");
        } else if ((Objects.equals(userChoice, "石头") && Objects.equals(computerGuess, "剪刀"))
                || (Objects.equals(userChoice, "剪刀") && Objects.equals(computerGuess, "布"))
                || (Objects.equals(userChoice, "布") && Objects.equals(computerGuess, "石头"))) {
            System.out.println("玩家获胜！！！");
        } else {
            System.out.println("你输了！");
        }
    }
}
