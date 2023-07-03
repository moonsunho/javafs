package a0630;

public class Ex5_9 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        System.out.println(sum);

        int[][] arr1 ={
            {5,5,5,5,5,5},
            {5,5,5,5,5,5},
            {5,5,5,5,5,5},
            {30,30}
        };
        System.out.println(arr1[3].length);


        // int[] arr2[];
        int[] arr3 = {1,2,3,};
        int[] arr4= new int[5];
        // int[] arr5= new int[5]{4,2,3,7,8};
        // int[] arr6[5]; 
        int[] arr7[]= new int[3][];
        
        // System.out.println(arr2);
        System.out.println(arr3);
        System.out.println(arr4);
        // System.out.println(arr5);
        // System.out.println(arr6);
        System.out.println(arr7);
    }
}
