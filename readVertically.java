package SoloTest.codeStatusProblem;


import java.util.Arrays;

public class readVertically {
    public static void main(String[] args) {
        String[] input = new String[]{
                "hello",
                "world",
        };

        int max = 0;
        for(int i=0;i<input.length;i++){
            if(max< input[i].length()){
                max =  input[i].length();
            }
        }
        String[] result = new String[max];

        for(int i=0;i<input.length;i++){
            String str = input[i];
            for(int j=0;j<str.length();j++){
                if(result[j]==null){
                    result[j]= String.valueOf(str.charAt(j));
                    System.out.println(Arrays.toString(result));
                }else {
                    result[j] = result[j] + str.charAt(j);
                    System.out.println(Arrays.toString(result));
                }
            }
        }

//        System.out.println(Arrays.toString(result));
        String answer ="";
        for(int i=0;i< result.length;i++){
            answer += result[i];
        }
        System.out.println(answer);
    }
}