package Algorithm.Jan;

import java.util.Arrays;

public class ja0124 {
    public static int[] MergeSort(int[] arr){
        int len = arr.length;
        if(len>1){
            int[] left = Arrays.copyOfRange(arr, 0, len/2);
            int[] right = Arrays.copyOfRange(arr, len/2, len);

            left = MergeSort(left);
            right = MergeSort(right);

            return Merge(left, right);
        }
        return arr;
    }

    public static int[] Merge(int[] left, int[] right){
        int[] Merged = new int[left.length + right.length];
        int i= 0, j = 0, k = 0;

        while(i<left.length&&j<right.length){
            if(left[i]<right[j]){
                Merged[k++] = left[i++];
            } else {
                Merged[k++] = right[j++];
            }
        }
        while (i<left.length) {
            Merged[k++] = left[i++];
        }
        while (j<right.length) {
            Merged[k++] = right[j++];
        }

        return Merged;

        //10:54
        //정확도 향상
        //자바배열에 대한 공부 필요
    }

    public static void main(String[] args){
        int[] arr = {5, 2, 1, 3, 7, 4, 8, 1, 2, 3};

        String result = Arrays.toString(MergeSort(arr));
        System.out.println(result);
    }
}
