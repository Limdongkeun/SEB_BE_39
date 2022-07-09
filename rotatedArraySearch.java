package SoloTest.codeStatesProblem;

public class rotatedArraySearch {

    public static int rotated(int[] rotated, int target){

        int low = 0;
        int high = rotated.length-1;

        if(target > rotated.length){
            return -1;
        }
        while (low<=high){
            int mid = (low+high)/2;
            if(rotated[mid]==target){
                return mid;
            }

            if(rotated[low]<rotated[mid]){
                System.out.println("위 high = " + high);
                System.out.println("위 low = " + low);
                if(target<rotated[mid] && target >= rotated[low]){
                    high = mid -1;
                    System.out.println("위 high = " + high);
                }else{
                    low = mid +1;
                    System.out.println("위 low = " + low);
                }
                System.out.println("위 high = " + high);
                System.out.println("위 low = " + low);
            }else {
                System.out.println("아래 low = " + low);
                System.out.println("아래 high = " + high);
                if(target<=rotated[high] && target>rotated[mid]){
                    low = mid+1;
                    System.out.println("아래 low = " + low);
                }else{
                    high = mid -1;
                    System.out.println("아래 high = " + high);
                }
                System.out.println("아래 low = " + low);
                System.out.println("아래 high = " + high);
            }
        }
        return -1;
    }

    public static void main(String[] args) {


        System.out.println(rotated(new int[]{10,11,12,3,6,7,8,9},1));
    }
}
