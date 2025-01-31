package Algorithm.Jan;

import java.util.Arrays;

public class ja0131 {
    public static int[] BubbleSort(int[] arr){
        int len = arr.length;
        for(int i=0; i<len; i++){
            for(int j=0; j<len-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
        //3:36
    }

    public static int[] SelectionSort(int[] arr){
        int len = arr.length;
        for(int i=0; i<len; i++){
            int Min=i;
            for(int j=i; j<len; j++){
                if(arr[Min]>arr[j]){
                    Min=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[Min];
            arr[Min]=temp;
        }
        return arr;
        //7:55
    }

    public static int[] InsertSort(int[] arr){
        int len = arr.length;
        for(int i = 0; i<len; i++){
            for(int j=i; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
        //3:67
    }

    public static int[] MergeSort(int[] arr){
        int len =arr.length;
        if(len>1){
            int[] left = Arrays.copyOfRange(arr, 0, len/2);
            int[] right = Arrays.copyOfRange(arr, len/2, len);

            left = MergeSort(left);
            right = MergeSort(right);

            arr = Merge(left, right);
        }
        return arr;
    }
    public static int[] Merge(int[] left, int[] right){
        int[] MergedArr = new int[left.length + right.length];
        int i=0, j=0, k=0;
        while (i<left.length&&j<right.length) {
            if(left[i]<right[j]){
                MergedArr[k++]=left[i++];
            } else {
                MergedArr[k++]=right[j++];
            }
        }
        while (i<left.length) {
            MergedArr[k++]=left[i++];
        }
        while (j<right.length) {
            MergedArr[k++]=right[j++];
        }
        return MergedArr;
        //11:11
    }



    public static void main(String[] args){
        int[] arr1 = {5, 2, 1, 3, 7, 4, 8, 1, 2, 3};

        String result1 = Arrays.toString(BubbleSort(arr1));
        System.out.println(result1);

        int[] arr2 = {5, 2, 1, 3, 7, 4, 8, 1, 2, 3};

        String result2 = Arrays.toString(SelectionSort(arr2));
        System.out.println(result2);

        int[] arr3 = {5, 2, 1, 3, 7, 4, 8, 1, 2, 3};

        String result3 = Arrays.toString(InsertSort(arr3));
        System.out.println(result3);

        int[] arr4 = {5, 2, 1, 3, 7, 4, 8, 1, 2, 3};

        String result4 = Arrays.toString(MergeSort(arr4));
        System.out.println(result4);
    }
}
