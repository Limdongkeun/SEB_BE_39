package JAVA_PRATICE;

import java.util.Scanner;

public class BackJoon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int min = input.nextInt();
//        int sec = input.nextInt();
//        int cook = input.nextInt();
//
//        if(min==23){
//            min = min +1;
//        }
//        if(sec==59){
//            sec = 0;
//            min = min+1;
//        }
//        if(cook+sec==60){
//            sec =0;
//            cook =0;
//            min = min +1;
//        }
//        System.out.println(String.format("%d는 %d %d",min, sec, cook));

        int a = input.nextInt();
        for(int i=1;i<=9;i++){
                System.out.println(String.format("%d * %d = %d",a,i,a*i));
        }
    }
}
