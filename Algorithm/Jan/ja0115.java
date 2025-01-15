package Algorithm.Jan;

import java.util.Arrays;

public class ja0115 {
    public static int[] BubbleSort(int[] arr){
        int len = arr.length;
        for(int i =0; i<len; i++){
            for(int j =0; j<len-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    } 

    public static void main(String[] args) throws Exception {
        //O(n^2)Bubble sort


        int[] arr = {3, 5, 2, 1, 4};
        System.out.println(Arrays.toString(BubbleSort(arr)));
    }
}
