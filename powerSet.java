package SoloTest.codeStatesProblem;

import java.util.ArrayList;
import java.util.Arrays;


public class powerSet {
//    public static ArrayList<String> powerSet(String str){
//
//
//
//    }

    public static void main(String[] args) {
//        System.out.println(powerSet("abc"));

        String a = "abc";

        String[] split = a.split("");
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i=0;i< split.length;i++){
            arrayList.add(split[i]);
        }
        System.out.println("arrayList = " + arrayList);
        System.out.println("split = " + Arrays.toString(split));
    }
}
