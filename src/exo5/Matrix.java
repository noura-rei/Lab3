package exo5;

public class Matrix {
    public static int[][] matrixAdd(int[][] arr1,int[][] arr2){
        //if(arr1.length!=arr2.length) return [[0]];
        //if(arr1[0].length!= arr2[0].length) return [[0]];
        // Assuming arrays have the same dimensions
        int[][] resultMatrix = new int[arr1.length][arr1[0].length];
        // LOOP POUR ADDITION
        for(int i = 0;i<arr1.length;i++){
            for(int j = 0;j<arr1[i].length;j++){
                resultMatrix[i][j] = arr1[i][j]+arr2[i][j] ;
            }
        }
        return resultMatrix ;
    }
    public static void main(String[] args){
        int[][] m1 = {{1,2},{3,4},{7,4}};
        int[][] m2 = {{8,9},{0,1},{76,9}};
        int[][] arr = matrixAdd(m1,m2);

        for(int[] e :arr){
            for(int a : e){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
