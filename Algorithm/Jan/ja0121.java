package Algorithm.Jan;

import java.util.Arrays;

public class ja0121 {
    public static int[] BubbleSort(int[] arr){
        int len = arr.length;
        for(int i =0;i<len;i++){
            for(int j=0;j<len-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
        //2:42
    }

    public static int[] CocktailSort(int[] arr){
        int len = arr.length;
        for(int i=0; i<len; i++){
            if(i%2==1){
                for(int j=0;j<len-i;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]=temp;
                    }
                }
            } else {
                for(int k=len-i-1;k>i;k--){
                    if(arr[k]<arr[k-1]){
                        int temp=arr[k-1];
                        arr[k-1]=arr[k];
                        arr[k]=temp;
                    }
                }
            }
        }
        return arr;
        //3:31
    }

    public static int[] SelectionSort(int [] arr){
        int len = arr.length;
        for(int i = 0; i<len;i++){
            int tempMin=i;
            for(int j=i+1;j<len;j++){
                if(arr[j]<arr[tempMin]){
                    tempMin=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[tempMin];
            arr[tempMin]=temp;
        }
        return arr;
        //2:54
    }

    public static int[] InsertSort(int[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
        //3:00
    }


    public static void main(String[] args){
        int[] arr1 = {5, 2, 3, 4, 1};
        int[] result1 = BubbleSort(arr1);
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] arr2 = {5, 2, 3, 4, 1};
        int[] result2 = CocktailSort(arr2);
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] arr3 = {5, 2, 3, 4, 1};
        int[] result3 = SelectionSort(arr3);
        for (int num : result3) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] arr4 = {5, 2, 3, 4, 1};
        int[] result4 = InsertSort(arr4);
        for (int num : result4) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
}
