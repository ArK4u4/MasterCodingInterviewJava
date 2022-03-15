package com.ArKC;

public class Searching {
    public static void main(String[] args) {
        System.out.println("Search Number in sorted Array");
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int target = 4;
        searchNumber(array, target);
        System.out.println(searchNumber(array, 4));

    }
    private static int searchNumber(int[] array1, int target) {
        int start = 0;
        int end = array1.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < array1[mid]) {
                end = mid - 1;
            } else if (target > array1[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;


    }
}
