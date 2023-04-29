package Arrays;

//gere e imprime uma matriz 4x4 com numeros aleatorio, entre 0 e 9

import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random(); //gera numeros aleatórios

        int[][] M = new int[4][4];    //colchetes representa linha e coluna, 4 linhas e 4 colunas

        for (int i = 0; i < M.length; i++) {          //linha
            for (int j = 0; j < M[i].length; j++) {   //coluna
                M[i][j] = random.nextInt(9);

            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : M) {
            for (int elementodacoluna : linha) {
                System.out.print(elementodacoluna + " ");
            }
            System.out.println();

        }
    }

}
