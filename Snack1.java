/*Chiedi all’utente di continuare ad inserire un numero pari compreso tra 10 e 20. 
Se il numero non corrisponde alla richiesta continuare a chiederlo fino a che non viene inserito un numero valido.*/


import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //creo un oggetto scanner che leggerà l'input da tastiera
        int numeroPari; 

        do { 
            System.out.println("Inserisci un numero pari compreso tra 10 e 20:"); //il do permette di eseguire il ciclo almeno una volta
            numeroPari = sc.nextInt(); //la variabile numeroPari memorizzerà l'input

            if (numeroPari < 10 || numeroPari > 20) {
                System.out.println("Numero non valido: deve essere compreso tra 10 e 20.riprova.");
            } else if (numeroPari % 2 != 0) {
                System.out.println("Numero pari non valido");
            } else {
                System.out.println("Complimenti,il numero inserito è un numero Pari");
            }

        } while (numeroPari < 10 || numeroPari > 20 || numeroPari % 2 != 0); //il ciclo si ripete fino a quando non si verifica questa condizione

        sc.close();
    }
}



