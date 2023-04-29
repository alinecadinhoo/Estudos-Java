package Arrays;

import java.util.Scanner;

// ler vetor de 6 caracteres e mostre as consoantes

public class Consoante {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") | //verifica se duas strings são iguais
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {

                consoantes[count] = letra;
                quantidadeConsoantes++;
            }

            count++;


        } while (count < consoantes.length);

        System.out.print("Consoantes: ");
        for (String consoante : consoantes) {
            if ( consoante != null)
            System.out.println(consoante + " ");

        }

        System.out.println("Quantidades de consoantes: " + quantidadeConsoantes);

    }

}
