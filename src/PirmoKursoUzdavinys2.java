
import java.util.Arrays;
import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BestBeast
 */
public class PirmoKursoUzdavinys2 {
    
    private static int[] _initiate(){
        Random rand = new Random(); 
        int max = rand.nextInt(30);
        System.out.println(max);
        int init[] = new int[max] ;
        for (int i=0;i < max;i++){
            init[i] = rand.nextInt(100);
        }
        //System.out.println(Arrays.toString(init));

    return init;
    }
    
    private boolean _checkPrime(int a){
        int i;
        boolean ret = false;
        for (i=2; i < a ;i++ ){
            int n = a%i;
            if (n==0){
                ret = false;
                break;
            }
        }
        if(i == a){
            ret = true;
        }
        return ret;
    }
    
    public void swapExtreamPrimes(int[] a, int max, int min){
        int indMax = 0;
        int indMin = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max && _checkPrime(a[i])) {
                max = a[i]; indMax = i;
            }
            if (a[i]<min && _checkPrime(a[i])) {
                min = a[i]; indMin = i;
            }
        }
        int temp = a[indMin];
        a[indMin] = a[indMax];
        a[indMax] = temp;
    }
    
    public static void output(){
        System.out.println("****** Klasė PirmoKursoUzdavinys2 **********");
         int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] b1 = _initiate();
        int[] b2 = _initiate();
        PirmoKursoUzdavinys2 p2 = new PirmoKursoUzdavinys2();
        System.out.println("Pradinis masyvas = "  + Arrays.toString(b1));
        p2.swapExtreamPrimes(b1, max, min);
        //System.out.println("Sukeistas masyvas = "  + max);
        //System.out.println("Sukeistas masyvas = "  + min);
        System.out.println("Sukeistas masyvas = "  + Arrays.toString(b1));

        System.out.println("Pradinis masyvas = "  + Arrays.toString(b2));
        p2.swapExtreamPrimes(b2, max, min);
        //System.out.println("Sukeistas masyvas = "  + max);
        //System.out.println("Sukeistas masyvas = "  + min);
        System.out.println("Sukeistas masyvas = "  + Arrays.toString(b2));
    }
    
}
