package com.imooc.aspect;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        System.out.println(kthSmallest(matrix,8));
    }
    public static int kthSmallest(int[][] matrix, int k) {
        int lo = matrix[0][0], hi = matrix[matrix.length-1][matrix.length-1];
        int mid, count;
        while (lo < hi) {
            mid = lo + (hi - lo) / 2;
            count = 0;
            for (int i = 0; i < matrix.length; i++) {
                count += countRow(matrix[i], mid);
            }
            if (count >= k) hi = mid;
            else lo = mid + 1;
        }
        return lo;
    }
    // 二分法：每一行 <= target 的数目，也就是 下边界
    public static int countRow(int[] row, int target) {
        int lo = 0, hi = row.length;
        int mid;
        while (lo < hi) {
            mid = lo + (hi - lo) / 2;
            if (row[mid] > target) hi = mid;
            else lo = mid + 1;
        }
        return lo;
    }
}
