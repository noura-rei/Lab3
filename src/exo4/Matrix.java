package exo4;

public class Matrix {
    public static void copyCol(int[][] arr,int n,int k,int l){
        for(int i= 0;i<n;i++){
            arr[l][i] = arr[k][i] ;
        }
    }
    public static void main(String[] args){
        int[][] arr = {{1,2,5,6,8,9,8,1},
                {74,85,96,4,5,35,7,2},
                {7,3,96,53,12,42,7,95},
                {6,5,87,42,51,63,0,3},
                {7,8,5,26,4,9,3,1},
                {0,1,2,36,4,5,9,8}
        } ;
        System.out.println("The matrix before copying :") ;
        for(int[] m : arr){
            for(int e: m){
                System.out.print(e+" ");
            }
            System.out.println();
        }
        copyCol(arr,8,1,4);
        System.out.println("The matrix after copying :") ;
        for(int[] m : arr){
            for(int e: m){
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }
}
