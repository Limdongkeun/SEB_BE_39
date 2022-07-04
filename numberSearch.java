package SoloTest.codeStatesProblem;

public class numberSearch {
    public static void main(String[] args) {
        String str = "Hello6 9World 2, Nic8e D7ay!";

//        String result ="";
//        double answer =0;
//        for(int i=0;i<str.length();i++){
//            char ch = str.charAt(i);
//            if(48 <= ch && ch <= 57){
//                result += ch;
//            }
//        }
//        for(int i=0;i<result.length();i++){
//            char ch = result.charAt(i);
//            answer += Integer.parseInt(String.valueOf(ch));
//        }
//
//        System.out.println("answer = " + answer/str.length());

//        String restr = str.replaceAll("[^0-9]","");
//        System.out.println(str + " ==> " + restr);
//
//
//        double result =0;
//        for(int i=0;i<restr.length();i++){
//            char ch = restr.charAt(i);
//            result += Integer.parseInt(String.valueOf(ch));
//        }
//        System.out.println("result = " + result);
//        double num = result/str.length();
//        System.out.println(Math.ceil(num));
//        System.out.printf("%.0f",Math.ceil(num));

//        String nums = "0123456789";
//
//        int sum =0;
//        String reStr = "";
//
//        for (int i =0;i<str.length();i++){
//            if(nums.indexOf(str.charAt(i)) != -1){
//                sum += Character.getNumericValue(str.charAt(i));
//            } else if (str.charAt(i) != ' ') {
//                reStr = reStr + str.charAt(i);
//            }
//        }
//        float answer = sum / reStr.length();
//        System.out.println((int) Math.round((answer*10)/10));

        if(str.length()==0){
            System.out.println(0);
        }

        float result =0;
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                result += str.charAt(i) -'0';
                count++;
                System.out.println("str.charAt(i) = " + str.charAt(i));
                boolean isNumeric = str.matches("[+-]?\\d*(\\.\\d+)?"); //숫자인지 판별
                System.out.println("isNumeric = " + isNumeric);
            } else if (str.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("count = " + count);
        int round = Math.round(result / (str.length() - count));
        System.out.println("round = " + round);
    }
}
