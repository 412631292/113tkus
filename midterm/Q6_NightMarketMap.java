import java.util.Scanner;

public class Q6_NightMarketMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = Integer.parseInt(sc.nextLine());
        char[][] map = new char[10][10];

        // 初始化地圖，全部填入 #
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                map[i][j] = '#';
            }
        }

        // 標示熱門攤位座標為 *
        for (int i = 0; i < m; i++) {
            String[] coords = sc.nextLine().split(" ");
            int r = Integer.parseInt(coords[0]);
            int c = Integer.parseInt(coords[1]);

            // 檢查座標範圍，超出範圍就忽略
            if (r >= 0 && r < 10 && c >= 0 && c < 10) {
                map[r][c] = '*';
            }
        }

        // 輸出地圖
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
