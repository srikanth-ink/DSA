// bubble sort

import java.util.Arrays;
class SortArray{
    public static void main(String[] args) {
        int[] arr = {20,10,5,3,30};
        String ans = Arrays.toString(sortArray(arr));

    }
    public static int[] sortArray(int[] arr){
        int temp = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}