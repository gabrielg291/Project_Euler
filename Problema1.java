

public class Problema1 {

    //hallar la suma de los multiplos de 3 y 5 menores a 1000
    
    /*Plan:
     * calcular formula de la sumatoria
     * 
     * Crear funcion caluclarSuma(n,limite) para sumar todos los multiplos de n menores a limite
     * crear funcion para hallar todos
     */
    public static void main(String[] args) {
        int i=3;
        int j=5;
        int limite = 1000;
        
        int suma = calcularSuma(i,limite) + calcularSuma(j,limite) - calcularSuma(i*j, limite);
        System.out.println(suma);
    }

    public static int calcularSuma(int i, int limite) {
        
        int n= calcularLimite(i,limite);
        int suma= i*n*(n+1)/2;
        
        return suma;
    }

    public static int calcularLimite(int i, int limite) {
        // hacemos do while para que la funcion sea estrictamente menor a limite
        do { 
            limite--;
            } while (limite%i!=0);
        return(limite/i);
    }

    

}