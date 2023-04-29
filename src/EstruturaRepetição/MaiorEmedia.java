package EstruturaRepetição;

//um programa que leia 5 números
// e informe o maior e a média desses números

import java.util.Scanner;

public class MaiorEmedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0; //contador
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if(numero > maior) maior = numero;

            count = count + 1; //contar quantas vezes se repita
        } while(count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));
    }
}
