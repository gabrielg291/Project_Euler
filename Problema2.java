

public class Problema2 {
    
    //ejercicio: sucesion de fibonacci:
    // 1,2,3,5,8,13,21,34,55,89...
    //la solucion debe dar una suma de todos los numeros pares menores
    //a 4000000 pertenecientes a la sucesion de fibonacci
    
    
//solucion iterativa: 
 
    public static void main(String[] args) {
        int limite=4000000;
        System.out.println(sumaFiboPares(limite));
    }

    public static int sumaFiboPares(int limite) {
        int a=0;
        int b=1;
        int temp;
        int suma=0;
        
        while (a<limite){ 
            suma+= a%2==0 ? a: 0;
            temp = a + b;
            a+=b;
            b=temp;
        }
        return suma;
    }

    


//solucion recursiva:

//    public static void main(String[] args) {
        
 //   }
}
