package Arrays;

// vetor de 6 números e mostrar inverso

public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-6, -5, 15, 50, 8, 4}; //começa posição 0 - 5 posições

        System.out.println("Vetor: ");
        int count = 0;
        while (count <= (vetor.length - 1)) { //mostra o comprimento do vetor, quantos numeros tem
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");


        }
    }
}
