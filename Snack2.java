/* Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi, 
e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome. */

import java.util.Random; //importiamo la classe Random per generare numeri casuali

public class Snack2 {
    
    public static void main(String[] args) {
        String [] nomi = {"Maurizia", "Flavia", "Davide", "Marco", "Tiziana", "Maria"};
        String [] cognomi = {"Russo", "DeSantis", "Foglia", "Esposito", "DelliBovi", "Colombo"};
        Random r = new Random(); //creazione oggetto Random per generare numeri casuali

        int indiceNome; //variabile dove verrà memorizzato l'indice di ogni elemento dell'array "nome"
        int indiceCognome; //variabile dove verrà memorizzato l'indice di ogni elemento dell'array "cognome" 

        for(int i=0; i<nomi.length; i++){  //il ciclo continua tante volte quanti sono gli emelenti
            indiceNome= r.nextInt(nomi.length); //indiceNome va a memorizzare un numero casuale degli indici dell'array nome
            indiceCognome= r.nextInt(cognomi.length);
            System.out.println("Invitati: " + nomi [indiceNome] + " " +  cognomi [indiceCognome]); //stampa in maniera casuale nome e cognome dell'invitato
        }

    }
}

 //evitare ripetizioni di nomi e cognomi 