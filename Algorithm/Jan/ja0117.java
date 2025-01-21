package Algorithm.Jan;

import java.util.Arrays;

public class ja0117 {
    public static int[] BubbleSort(int[] arr){
        int len = arr.length;
        for(int i=0; i<len; i++){
            for(int j=0; j<len-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
        //3분 10초
        //O(n^2)
    }
    public static int[] SelectionSort(int [] arr){
        int len = arr.length;
        for(int i=0; i<len; i++){
            int temp=arr[i];
            int A=i;
            for(int j=i; j<len; j++){
                if(temp>arr[j]){
                    temp=arr[j];
                    A=j;
                }
            }
            arr[A]=arr[i];
            arr[i]=temp;
        }
        return arr;
        //10분 45초
    }
    public static int[] Ans(int[] arr){
        int indexMin, temp;
        int len = arr.length;
        for(int i = 0; i<len; i++){
            indexMin=i;
            for(int j = i+1; j<len; j++){
                if(arr[j]<arr[indexMin]){
                    indexMin=j;
                }
            }
            temp=arr[indexMin];
            arr[indexMin]=arr[i];
            arr[i]=temp;
        }
        return arr;
        //indexMin는 i
        //indexMin과 j(i~끝)을 비교해 더 낮은 숫자를 indexMin으로
        //내부 for문이 끝나면 indexMin과 i 변경
    }

    public static void main(String[] args){
        int[] arr1 = {5, 2, 3, 4, 1};
        int[] result1 = BubbleSort(arr1);
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] arr2 = {5, 2, 3, 4, 1};
        int[] result2 = SelectionSort(arr2);
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] arr3 = {5, 2, 3, 4, 1};
        int[] result3 = Ans(arr3);
        for (int num : result3) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
