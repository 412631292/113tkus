
import java.util.Scanner;

public class Q7_DailyPowerReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] power = new int[7];
        for (int i = 0; i < 7; i++) {
            power[i] = sc.nextInt();
        }

        // 原地反轉：用雙指標交換
        int left = 0, right = 6;
        while (left < right) {
            int temp = power[left];
            power[left] = power[right];
            power[right] = temp;
            left++;
            right--;
        }

        // 輸出反轉後結果
        for (int i = 0; i < 7; i++) {
            System.out.print(power[i]);
            if (i != 6) {
                System.out.print(" ");
            }
        }
        System.out.println();

        sc.close();
    }
}
