
import java.util.ArrayList;

public class Problema3 {
    
    //Ejercicio: hallar los factores primos de 600851475143
    // en el caso de 13195 son 5, 7, 13, 29

    /*Plan:
     * hallar el valor mas alto posible de los primos: (n/log(n)), Teorema del Número Principal 
     */
    public static void main(String[] args) {
        double numADescomponer= 600851475143L;
        ArrayList<Integer> factores=descomponer(numADescomponer);
        factores.forEach(System.out::println);
    }

    
    public static ArrayList<Integer> descomponer(double x) {
        ArrayList<Integer> factores = new ArrayList<>();
        int i=3;
        int[] temp;
        
        if (x%2 == 0) {
                temp = pares(x);
                factores.add(temp[0]);
                x=temp[1];
        }
        while(x!=1){
            temp =impares(i,(int)x);
            factores.add(temp[0]);
            x=temp[1];
            i=factores.getLast() + 2;
        }
        return factores;
    }

    public static int[] pares(double x) {
        int[] conjunto = new int[2];
        conjunto[0]=2;
        conjunto[1]= x%2!=0?(int)x:pares(x/2)[1];
        return conjunto;
    }

    public static int[] impares(int ultimoValor,int x) {
        int i=ultimoValor;
        int resultado= x;
        while (resultado%i!=0){
            i+=2;
        }
        while (resultado%i==0) {
            resultado/=i;
        }
        int []conjunto={i,resultado};
        return conjunto;
    }


}
