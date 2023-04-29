package Collections;

//uma lista com 7 notas de alunos

import java.util.*;

public class Lista {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione as sete notas: ");

       List <Double> notas = new ArrayList<Double>();
       notas.add(7.0);
       notas.add(5.0);
       notas.add(4.0);
       notas.add(6.0);
       notas.add(1.0);
       notas.add(9.0);
       notas.add(8.0);
        System.out.println(notas); //pode utilizar esse metodo ou notas.toString();
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d)); //index acha a posição entre ()
        System.out.println("Adiciona na lista a nota 8.0 na posição 4: " );
        notas.add(4,8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0); //set substitui as notas
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d)); //contains para acha a nota

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for(double nota : notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;
        while(iterator.hasNext()) {  //iterator ele pega e soma fazendo o laço de repetição
            double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size())); //size retorna

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);








    }
}
