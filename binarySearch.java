package SoloTest.codeStatesProblem;

public class binarySearch {
    public static int solution(int[]arr, int target){
        int low = 0;
        int high = arr.length-1;


        while (low<=high){
            int mid = (low+high)/2;
            if(target == arr[mid]){
                return mid;
            } else if (target < arr[mid]) {
                high = mid -1;
            }else {
                low = mid +1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {4,6,8,9,10,15};
        int target = 9;
        System.out.println(solution(arr,target));

    }
}
