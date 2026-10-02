package exo7;

public class Arr {
    public static double stdev(int[] arr){
        // Calcul de average :
        double avg = 0 ;
        for(int e:arr){
            avg += e ;
        }
        avg = avg/(double) arr.length ;
        // Calcul of square differences :
        double sum  = 0;
        for(int e:arr){
            sum+=Math.pow(e-avg,2) ;
        }
        return Math.sqrt(sum/(arr.length-1));
    }
    public static void main(String[] args){
        int[] arr = {1,-2,4,-4,9,-6,16,-8,25,-10};
        System.out.print("The STDEV of this array is: "+stdev(arr));
    }
}
