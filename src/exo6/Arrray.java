package exo6;
import exo1.MyArray;

public class Arrray {
    public static int median(int[] arr){
        int[] result = MyArray.sortArray(arr);
        for(int e:result){
            System.out.print(e+" ");
        }
        return result[result.length/2];
    }

    public static void main(String[] args){
        int[] arr1 = {5,2,4,17,55,4,3,26,18,2,17};
        int[] arr2 = {42,37,1,97,1,2,7,42,3,25,89,15,10,29,27};

        System.out.println("Median of arr1 :"+median(arr1));
        System.out.println("Median of arr2 :"+median(arr2));

    }
}
