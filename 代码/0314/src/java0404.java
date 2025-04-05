import java.util.HashSet;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class java0404 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[100];

        // 读取输入数组
        for (int i = 0; i < 100; i++) {
            arr[i] = scan.nextInt();
        }

        // 用 HashSet 存储不同的日期
        HashSet<String> uniqueDates = new HashSet<>();

        // 枚举所有可能的 8 位子序列
        for (int i1 = 0; i1 <= 100 - 8; i1++) {
            if (arr[i1] != 2) continue; // 第一位必须是 2
            for (int i2 = i1 + 1; i2 <= 100 - 7; i2++) {
                if (arr[i2] != 0) continue; // 第二位必须是 0
                for (int i3 = i2 + 1; i3 <= 100 - 6; i3++) {
                    if (arr[i3] != 2) continue; // 第三位必须是 2
                    for (int i4 = i3 + 1; i4 <= 100 - 5; i4++) {
                        if (arr[i4] != 3) continue; // 第四位必须是 3
                        for (int i5 = i4 + 1; i5 <= 100 - 4; i5++) {
                            for (int i6 = i5 + 1; i6 <= 100 - 3; i6++) {
                                int month = arr[i5] * 10 + arr[i6];
                                if (month < 1 || month > 12) continue; // 月份必须是 01-12
                                for (int i7 = i6 + 1; i7 <= 100 - 2; i7++) {
                                    for (int i8 = i7 + 1; i8 < 100; i8++) {
                                        int day = arr[i7] * 10 + arr[i8];
                                        if (isValidDate(month, day)) {
                                            // 构造日期字符串
                                            String date = "2023" + String.format("%02d%02d", month, day);
                                            uniqueDates.add(date);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        // 输出不同日期的数量
        System.out.println(uniqueDates.size());
        scan.close();
    }

    // 检查日期是否有效
    private static boolean isValidDate(int month, int day) {
        if (day < 1 || day > 31) return false;
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return day <= daysInMonth[month];
    }
}