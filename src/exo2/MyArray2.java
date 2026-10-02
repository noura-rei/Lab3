package exo2;

public class MyArray2 {
    public static void reverse(int[] arr) {
        System.out.println("Array before reverse :");
        for(int e:arr){
            System.out.print(e+" ") ;
        }
        System.out.println();
        System.out.println("Array after reverse :");
        int l = arr.length/2 ;
        for(int i=0;i<l;i++){
            int temp = arr[i] ;
            arr[i]=arr[arr.length-1-i] ;
            arr[arr.length-1-i] = temp ;
        }

        for(int e:arr){
            System.out.print(e+" ") ;
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr) ;
    }
}
