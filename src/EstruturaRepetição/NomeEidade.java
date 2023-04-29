package EstruturaRepetição;

import java.util.Scanner;

public class NomeEidade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);   //entrada de dados

        String nome;
        int idade;

        while (true) {    //criar um laço de repetição
            System.out.println("Nome: "); //Peça o nome
            nome = scan.next();   //para pessoa digitar o nome
            if (nome.equals("0")) break; // para o laço no 0 (caso for igual a 0), o break interrompe

            System.out.println("Idade: ");
            idade = scan.nextInt(); //para pessoa digitar a idade

        }

        System.out.println("Continua aqui...");
    }
}
