package SoloTest.codeStatesProblem;

public class phoneNumChange {
    public static void main(String[] args) {
        String phNum = "027778888";
        String answer = "";

//        for (int i=0;i<phNum.length()-4;i++){
//            answer = phNum.replace(phNum.charAt(i), '*');
//        }
//        System.out.println("phNum = " + phNum);
//        System.out.println("answer = " + answer);

        String back = "";
          for(int i = 0; i < phNum.length()-4; i++){
              answer += "*";
          }
        System.out.println("answer = " + answer);

          back = phNum.substring(phNum.length()-4,phNum.length());
         answer += back;

        System.out.println("back = " + back);
        System.out.println("answer = " + answer);
    }
}