package EstruturaRepetição;

import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota= scan.nextInt(); //para pessoa digitar

        while(nota < 0 || nota > 10) { //só entra no while se não tiver a nota entre 0 a 10
            System.out.println("Nota inválida! Digite Novamente: ");
            nota = scan.nextInt(); //para pessoa digitar


        }
    }
}
