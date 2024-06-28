package Atividade02;

import java.util.Arrays;

public class At01 {
    public static void main(String[] args) {
        // 1. Ordenação Personalizada: Implemente um algoritmo que ordene um array de
        // objetos com base em um critério personalizado (por exemplo, ordem alfabética
        // de strings ou ordenação numérica).

        String[] nomes = { "Carla", "Amelia", "Beatriz" };


        System.out.println("Nomes em ordem original:" );

        for (String nome : nomes) {
            System.out.println(nome);
        }

        Arrays.sort(nomes);
        System.out.println("\nNomes em ordem crescente:");


        for (String nome : nomes) {
            System.out.println(nome);
        }



    }





}
