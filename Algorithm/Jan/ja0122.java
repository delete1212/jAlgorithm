package Algorithm.Jan;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ja0122 {
    public static int[] MergeSort(int[] arr){
        int len = arr.length;
        if(len>1){
            int[] LArray = Arrays.copyOfRange(arr, 0, len/2);
            int[] RArray = Arrays.copyOfRange(arr, len/2+1, len);
            arr = IntStream.concat(Arrays.stream(MergeSort(LArray)), Arrays.stream(MergeSort(RArray))).toArray();
        }
        for(int i = 0; i<len; i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
        //12:24
        //오류
    }

    public static int[] Ans(int[] arr){
        int len = arr.length;
        if(len>1){
            int mid = len/2;
            int[] LArray = Arrays.copyOfRange(arr, 0, mid);//범위 0 ~ len/2-1
            int[] RArray = Arrays.copyOfRange(arr, mid, len);//범위 len/2 ~ len
            
            LArray = Ans(LArray);
            RArray = Ans(RArray);

            return merge(LArray, RArray);
        }
        return arr;
    }
    public static int[] merge(int[] left, int[] right){
        int[] merged = new int[left.length+right.length];
        int i = 0, j= 0, k = 0;

        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }
        while(i<left.length){
            merged[k++]=left[i++];
        }
        while (j<right.length){
            merged[k++]=right[j++];
        }

        return merged;
    }

    public static void main(String[] args){
        int[] arr1 = {5, 2, 3, 4, 1, 6};
        //int[] result1 = MergeSort(arr1);
        //for (int num : result1) {
        //    System.out.print(num + " ");
        //}
        System.out.println();

        int[] arr2 = {5, 2, 3, 4, 1, 6};
        int[] result2 = Ans(arr2);
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
