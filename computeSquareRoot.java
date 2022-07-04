package SoloTest.codeStatesProblem;

public class computeSquareRoot {
    public static void main(String[] args) {
        int n = 5;

        double result = 1;

        for (int i=0;i<10;i++){
           result = (result+(n/result)) /2;
        }
        System.out.printf("%.2f" , result);
    }
}
