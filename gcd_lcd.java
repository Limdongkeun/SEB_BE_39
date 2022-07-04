package SoloTest.codeStatesProblem;

import java.util.Arrays;
import java.util.Scanner;

public class gcd_lcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int max1 = 0;
        int min1 =0;
//        int big =0;
        int min =0;
        int[] arr = new int[2];

        if(num1>num2){
            min = num2;
        }else {
            min = num1;
        }

        //for문 사용
       for (int i=1;i<=min;i++){
            if(num1%i==0 && num2%i==0){
                min1 = i;
                arr[0] = min1;
            }
        }
        max1 = num1*num2/min1;
        arr[1] = max1;

        //while문
        int j=1;
        int max2 = 0;
        int min2 =0;
        while (min>=j) {
            if(num1%j==0 && num2%j==0){
                min2 = j;
                j++;
            }
        }
        max2 = num1*num2/min2;

        System.out.println("최대공약수 = " + min1);
        System.out.println("최소공배수 = " + max1);
        System.out.println(Arrays.toString(arr));

        System.out.println("min2 = " + min2);
        System.out.println("max2 = " + max2);
    }
}
