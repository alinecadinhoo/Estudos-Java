package EstruturaRepetição;

//mostre numeros inteiros e quantidade de numeros pares e impares

import java.util.Scanner;

public class ParEimpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0; //variáveis para guardar os numeros pares e impares

        System.out.println("Quantidade de números: "); //peça um número
        quantNumeros = scan.nextInt(); // entrada de dados

        int count = 0; //quantas vezes o laço vai acontecer, controla o loop
        do {
            System.out.println("Número: ");   //laço de repetição
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++; //quantpares = quantpares + 1
            else quantImpares++;

           count++;
        } while(count < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Impar: " + quantImpares);
    }

}
