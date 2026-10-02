package exo1;
import java.util.Arrays ;

public class MyArray {

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("Element "+i+" contents : "+arr[i]);
        }
    }
    public static int[] sortArray(int[] arr){
        int[] newArr = arr.clone();
        for(int i=0;i<arr.length-1;i++){
            int idx = i;
            for(int j=i+1;j<newArr.length;j++){
                if(newArr[idx]<newArr[j]){
                    idx = j;
                }
            }
            int temp = newArr[i];
            newArr[i] = newArr[idx];
            newArr[idx] = temp ;
        }
        return newArr ;
    }



    public static void main(String[] args){
        int[] arr = {106,26,81,5,15};
         System.out.println("Non sorted array :");
         printArray(arr);
         System.out.println("Sorted array :");
         int[] newArr = sortArray(arr);
         printArray(newArr);
    }

}
