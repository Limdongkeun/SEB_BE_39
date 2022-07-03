package SoloTest.codeStatesProblem;

import java.util.Arrays;

import static java.util.Collections.swap;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1,5,6,7,9,4};

       int front =0;

        for (int i=0;i<arr.length-1;i++){
            int cnt =0;
            for(int j=0;j<arr.length-1;j++){
                cnt++;
                if(arr[j] > arr[j+1]) {
                    front = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = front;
                    System.out.println("cnt = " + cnt);
                }

            }
            if(cnt==0){
                break;
            }

        }
        System.out.println("arr = " + Arrays.toString(arr));
    }

}
