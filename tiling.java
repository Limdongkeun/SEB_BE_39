package SoloTest.codeStatesProblem;

public class tiling {

    public static int til(int num){
        int a =2;
        int answer =0;

        int[] arr = new int[num];
        arr[0] = 1;
        arr[1] = 2;

        if(num == 1){
            return 1;
        } else if (num == 2) {
            return 2;
        }

        for(int i=2;i< arr.length;i++){
            answer = arr[i-1] + arr[i-2];
            arr[i] = answer;
//            System.out.println("answer = " + answer);
//            System.out.println(arr[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(til(4));
    }
}
