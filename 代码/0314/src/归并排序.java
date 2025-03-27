import java.util.Scanner;

public class 归并排序 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int j = 0; j < n; j++) {
            b[j] = scan.nextInt();
        }
        int[] ai = new int[n];
        for (int i = 0; i < n; i++) {
            ai[i] = a[i] - b[i];
        }

        long res = mergeSortAndCount(ai, 0, n - 1); // 使用 long 防止溢出
        System.out.print(res);
        scan.close();
    }

    private static long mergeSortAndCount(int[] arr, int left, int right) {
        if (left >= right) {
            return 0;
        }
        int mid = left + (right - left) / 2;
        long count = mergeSortAndCount(arr, left, mid) + mergeSortAndCount(arr, mid + 1, right);
        count += merge(arr, left, mid, right);
        return count;
    }

    private static long merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        long count = 0;

        // 合并时统计满足条件的对数
        while (i <=mid && j <= right) {
            if (arr[i] > -arr[j]) { // arr[i] + arr[j] > 0
                count += (mid - i + 1); // arr[i] 右侧的所有元素都满足
                temp[k++] = arr[j++];   // 注意这里先放入小的（j），保持稳定性
            } else {
                temp[k++] = arr[i++];
            }
        }

        // 处理剩余元素
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // 复制回原数组
        for (int p = 0; p < temp.length; p++) {
            arr[left + p] = temp[p];
        }
        return count;
    }
}