package SoloTest.codeStatesProblem;

import java.util.Arrays;

public class getItemFromTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 4, 8, 10};
        int[] arr2 = new int[]{2, 3, 5, 9};
        int k = 6;

        int destlength = arr1.length + arr2.length;

        int[] dest = new int[destlength];

        System.arraycopy(arr1,0,dest,0,arr1.length);
        System.arraycopy(arr2,0,dest,0,arr2.length);

        Arrays.sort(dest);

        System.out.println("dest = " + dest);
    }

}
