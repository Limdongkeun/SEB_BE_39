package SoloTest.codeStatesProblem;

import java.util.Arrays;

public class compressString {
    public static void main(String[] args) {
        String str = "wwwggoppopppp";

        str = str.toLowerCase();

        char before = str.charAt(0);

        int cnt = 1;
        String answer = "";

        str = str + ' ';

        for (int i = 1; i < str.length(); i++) {
            // 동일한 문자가 반복될 경우
            if (before == str.charAt(i)) {
                //count를 1씩 더해줍니다.
                cnt++;
            } else {
                // 이전과 다른 문자일 경우,
                // 반복된 횟수가 3 이상일 경우에만 문자열을 압축합니다.
                if (cnt >= 3) {
                    answer = answer + cnt + before;
                } else {
                    //count의 수만큼 결과에 문자열을 저장합니다.
                    for(int j = 0; j < cnt; j++) {
                        answer = answer + before;
                    }
                    //자바 11에서 지원하는 String.repeat메소드를 활용하면 조금 더 간단하게 작성이 가능합니다.
                    //result = result + Character.toString(before).repeat(count);
                }
                before = str.charAt(i);
                cnt = 1;
            }
        }
        System.out.println("answer = " + answer);
    }
}
