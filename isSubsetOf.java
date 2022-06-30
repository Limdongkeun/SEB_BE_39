package SoloTest.codeStatesProblem;

import java.util.*;

public class isSubsetOf {
    public static void main(String[] args) {
        // 내가 푼 방법
        int[] base = {1, 2, 3, 4, 5};
        int[] sample = {6,7};
//        List<Integer> list = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        for (int i : base) {
//            list.add(i);
//        }
//        for (int i : sample) {
//            list2.add(i);
//        }
//        boolean isVal = list.containsAll(list2);
//        System.out.println("isVal = " + isVal);

        //윤택님이 푼 방법
        Map<Integer, Boolean> map = new HashMap<>();
        for(int i=0;i< base.length;i++){
            map.put(base[i], true);
        }
        for (int i=0;i< sample.length;i++){
            if(!map.containsKey(sample[i]));
        }
    }
}
