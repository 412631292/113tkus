import java.util.Scanner;

public class Q5_CPBLPrefixWins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String results = sc.nextLine().trim();

        // prefixWins[i] = 第 i 場比賽前的勝場數（0-based）
        int[] prefixWins = new int[n + 1];
        prefixWins[0] = 0;

        for (int i = 1; i <= n; i++) {
            prefixWins[i] = prefixWins[i - 1] + (results.charAt(i - 1) == 'W' ? 1 : 0);
        }

        int q = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < q; i++) {
            int k = Integer.parseInt(sc.nextLine());
            if (k > n) k = n; // 防止查詢超出場數
            System.out.println(prefixWins[k]);
        }

        sc.close();
    }
}
