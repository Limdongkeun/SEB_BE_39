package SoloTest.codeStatusProblem;



public class hap {
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,15};
        int[] arr2 = {-2123,843,-733,1156,-919};

        System.out.println(arr[arr.length-1]);

        int max = arr2[arr2.length-1];
        int hap =0;

        if(arr2.length<3){
            if(arr2[0]<max){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
        }

        for(int i=0;i< arr2.length-1;i++){
            hap += arr2[i];
        }
        if(max>hap){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        System.out.println(hap);

        System.out.println("======================");

        if(arr.length ==0){
            System.out.println(false);
        }
        int sum = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<=sum){
                System.out.println(false);
            }
            sum += arr[i];
        }
        System.out.println(true);
    }
}
