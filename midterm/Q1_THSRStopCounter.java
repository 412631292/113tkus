import java.util.*;

public class Q1_THSRStopCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String[] stations = sc.nextLine().split(" ");
        String[] startEnd = sc.nextLine().split(" ");

        String start = startEnd[0];
        String end = startEnd[1];

        int startIndex = -1;
        int endIndex = -1;

        // 找出 start 和 end 的索引
        for (int i = 0; i < n; i++) {
            if (stations[i].equals(start)) {
                startIndex = i;
            }
            if (stations[i].equals(end)) {
                endIndex = i;
            }
        }

        if (startIndex == -1 || endIndex == -1 || startIndex > endIndex) {
            System.out.println("Invalid");
        } else {
            System.out.println(endIndex - startIndex + 1);
        }

        sc.close();
    }
}
