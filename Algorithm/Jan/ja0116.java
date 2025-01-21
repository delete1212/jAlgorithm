package Algorithm.Jan;

import java.util.Arrays;

public class ja0116 {
    public static int[] BubbleSort(int[] arr){
        int len = arr.length;
        for(int i=0; i<len; i++){
            for(int j =0; j<len-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
        //for문(반복문)이 2번 이루어지므로 시간복잡도 O(n^2)
    }

    public static int[] CocktailSort(int[] arr){
        int len = arr.length;
        for(int i=0; i<len; i++){
            if(i%2==1){
                for(int j=0;j<len-i-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]=temp;
                    }
                }
            } else {
                for(int k=len-i-2;k>i;k--){
                    if(arr[k]<arr[k-1]){
                        int temp=arr[k-1];
                        arr[k-1]=arr[k];
                        arr[k]=temp;
                    }
                }
            }
        }
        return arr;
        //버블의 파생형, 시간복잡도 역시 O(n^2)
    }



    public static void main(String[] args) throws Exception {
        int[] arr1 = {4, 5, 2, 3, 1};
        String result1 = Arrays.toString(BubbleSort(arr1));
        System.out.println(result1);
        int[] arr2 = {4, 5, 2, 3, 1};
        String result2 = Arrays.toString(BubbleSort(arr2));
        System.out.println(result2);
    }
}