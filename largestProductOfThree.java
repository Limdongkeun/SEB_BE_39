package SoloTest.codeStatesProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class largestProductOfThree {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 7};
        int[] arr2 = {-1, 2, -5, 7};
        int[] arr3 = {-5, -4, -3, -2, -1};
        int[] arr4 = {50, -20, -30, -5, 40};


        Arrays.sort(arr4);
        int answer =0;
        int max = arr4[arr4.length-1] * arr[arr4.length-2] * arr[arr4.length-3];
        int max2 = arr4[arr4.length - 1] * arr4[0] * arr4[1];

        System.out.println("arr = " + Arrays.toString(arr4));
        answer = Math.max(max,max2);
        System.out.println("answer = " + answer);

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<arr.length-2;i++) {
            for(int j = i+1;j<arr.length-1;j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    list.add(arr[i] * arr[j] * arr[k]);
                }
            }
        }

        int result = Collections.max(list);
        System.out.println("result = " + result);
    }
}
/**
 *     Arrays.sort(arr);
 *     int arrLength = arr.length;
 *     //가장 큰 양수 3가지를 곱한 값
 *     int candidate1 = arr[arrLength - 1] * arr[arrLength - 2] * arr[arrLength - 3];
 *     //가장 작은 음수 2가지와, 가장 큰 양수를 곱한 값
 *     int candidate2 = arr[arrLength - 1] * arr[0] * arr[1];
 *     return Math.max(candidate1, candidate2);
 */