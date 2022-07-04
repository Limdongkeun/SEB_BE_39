package SoloTest.codeStatesProblem;

import java.util.Arrays;

public class decryptCaesarCipher {
    public static void main(String[] args) {

        String str = "khoor";
        int secret = 3;
        String answer = "";

        char[] arr = str.toCharArray();
        int num =0;
        char alpa;

        for(int i=0;i<arr.length;i++) {
            if (arr[i] == ' ') {
                answer += arr[i];
            } else {
                num = arr[i] - secret;
            }

            if (num < 97) {
                num += 26;
            }
            alpa = (char) num;
            answer += alpa;
        }
        System.out.println("answer = " + answer);
    }
}
