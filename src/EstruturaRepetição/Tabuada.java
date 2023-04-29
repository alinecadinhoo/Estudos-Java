package EstruturaRepetição;

//tabuada de 1 a 10

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // abertura da entrada de fluxo de dados

        System.out.println("Tabuada: "); //qual numero o usuário quer
        int tabuada = scan.nextInt(); //entrada de dados

        System.out.println("Tabuada de: " + tabuada); //frase para indicar a tabuada
        for(int i = 1; i <= 10; i++) { //pode ser count ou i, contando de 1 em 1
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
            //número escolhido pelo usuário "X" o valor de i "=" a multiplicação do número com o i.


        }




    }


}
