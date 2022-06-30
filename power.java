package SoloTest.codeStatesProblem;

import java.util.Map;

public class power {

    public static long power(int base, int exponent){
       if(exponent==0){return 1;}

       int half = exponent/2;
       long res = power(base,half);
       long answer = (res * res) % 94906249;

       if(exponent%2==1){
           return (base*answer) % 94906249;
       }else {
           return answer;
       }
    }

    public static void main(String[] args) {
        System.out.println(power(3,20));
    }
}
