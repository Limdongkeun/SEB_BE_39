package SoloTest.codeStatesProblem;



public class isIsogram {
    public static void main(String[] args) {
        String str = "aba";
        String str2 = "Dermatoglyphics";

        str = str.toLowerCase();
        str2 = str2.toLowerCase();

        for(int i =0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)== str.charAt(j)){
                    System.out.println(false);
                }
            }
        }
    }
}
