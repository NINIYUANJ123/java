package com.imooc.aspect;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] numb = {5,4,1,7};
        System.out.println(hIndex(numb));
    }
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int left=0,right = citations[citations.length-1],mid=0,num=0;
        while (left < right){
            mid = (left + right) / 2;
            if ((0 <= (citations.length - mid) && (citations.length - mid) < citations.length)&&(citations[citations.length - mid] >= mid)){
                num = mid;
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return num;
    }
}
