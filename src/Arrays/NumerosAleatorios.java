package Arrays;

//leia 20 numeros aleatorio (0 a 100) armazene-os num vetor.
// mostre os sucessores

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;

        }

        System.out.print("Numeros Aleatorios: ");
        for(int numero : numerosAleatorios) {
            System.out.println(numero + " ");
        }

        System.out.print("Sucessores dos Numeros Aleatorios: ");
        for(int numero : numerosAleatorios) {
            System.out.println((numero+1) + " ");
        }
    }


}
