import java.util.Scanner;

public class Q4_TieredElectricBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] usages = new int[n];
        long total = 0;

        for (int i = 0; i < n; i++) {
            usages[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < n; i++) {
            long bill = Math.round(calc(usages[i]));
            System.out.println("Bill: $" + bill);
            total += bill;
        }

        long avg = Math.round((double) total / n);
        System.out.println("Total: $" + total);
        System.out.println("Average: $" + avg);

        sc.close();
    }

    // 計算單筆電費
    private static double calc(int kWh) {
        double bill = 0;
        if (kWh <= 120) {
            bill = kWh * 1.68;
        } else if (kWh <= 330) {
            bill = 120 * 1.68 + (kWh - 120) * 2.45;
        } else if (kWh <= 500) {
            bill = 120 * 1.68 + 210 * 2.45 + (kWh - 330) * 3.70;
        } else if (kWh <= 700) {
            bill = 120 * 1.68 + 210 * 2.45 + 170 * 3.70 + (kWh - 500) * 5.04;
        } else if (kWh <= 1000) {
            bill = 120 * 1.68 + 210 * 2.45 + 170 * 3.70 + 200 * 5.04 + (kWh - 700) * 6.24;
        } else {
            bill = 120 * 1.68*
