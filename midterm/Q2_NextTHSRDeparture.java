import java.util.*;

public class Q2_NextTHSRDeparture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] times = new int[n];
        String[] timeStrs = new String[n];

        for (int i = 0; i < n; i++) {
            String time = sc.nextLine();
            timeStrs[i] = time;
            times[i] = toMinutes(time);
        }

        String query = sc.nextLine();
        int queryMinutes = toMinutes(query);

        int idx = upperBound(times, queryMinutes);

        if (idx == n) {
            System.out.println("No train");
        } else {
            System.out.println(timeStrs[idx]);
        }

        sc.close();
    }

    // 將 HH:mm 轉成 總分鐘數
    private static int toMinutes(String time) {
        String[] parts = time.split(":");
        int hh = Integer.parseInt(parts[0]);
        int mm = Integer.parseInt(parts[1]);
        return hh * 60 + mm;
    }

    // 二分搜尋：找第一個 > target 的索引（upper bound）
    private static int upperBound(int[] arr, int target) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
