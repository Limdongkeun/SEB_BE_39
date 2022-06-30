package SoloTest.codeStatesProblem;

import java.util.Arrays;
import java.util.Scanner;

public class fibonacci {
    static int[] memo;
    public static int fibonacci(int num) {

        //bottom-up 동적 프로그래밍
        if(num >= 0){
            memo[0]=0;
        }
        if(num>=1){
            memo[1]=1;
        }
        re(memo, num);
//        System.out.println("num = " + num);
//        System.out.println(Arrays.toString(memo));
        return memo[num];
    }

    public static int re(int memo[], int num){
        if(num != 0 && memo[num] != 0)
            return memo[num];
        else if(num == 0)
            return 0;
        else {
//            System.out.println("num = " + num);
//            System.out.println(Arrays.toString(memo));
            memo[num] = re(memo, num - 2) + re(memo, num - 1);
            return memo[num];
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        memo = new int[N+1];
        System.out.println(fibonacci(N));

        //top-down
        int[]dp = new int[N+1];
        dp[0] =0;
        dp[1] =1;
        for(int i=2;i<=N;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println("dp = " + dp[N]);
    }
}

