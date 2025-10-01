//Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari

public class Snack3 {
    public static void main(String[] args) {
        int [] numeri= {2,3,7,4,9,10};
        int somma= 0;

/*  somma degli elementi dispari
        for(int i= 0; i<numeri.length;i++){
            if(numeri[i] % 2 != 0){
                somma = somma+numeri[i];
                System.out.println("La somma dei numeri dispari e: " + somma); */

//sommo gli elementi che si trovano in posizione dispari
        for(int i= 0; i<numeri.length; i++){
            if(i % 2 !=0){
                somma = somma+numeri[i];
                
            }
        
        }
        System.out.println("La somma degli elementi in posizione dispari e: " + somma);
    }
}



