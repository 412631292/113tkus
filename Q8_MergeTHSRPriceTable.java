import java.util.Scanner;

public class Q8_MergeTHSRPriceTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String[] stations = new String[n];
        int[][] prices = new int[n][2]; // [][0] = Standard, [][1] = Business

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split("\\s+");
            stations[i] = parts[0];
            prices[i][0] = Integer.parseInt(parts[1]);
            prices[i][1] = Integer.parseInt(parts[2]);
        }

        // 表頭
        System.out.printf("%-10s|%8s|%8s%n", "Station", "Standard", "Business");

        // 輸出資料
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10s|%8d|%8d%n", stations[i], prices[i][0], prices[i][1]);
        }

        sc.close();
    }
}
