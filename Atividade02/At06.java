package Atividade02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class At06 {
    public static void main(String[] args) {


        //6. Maior Sequência Crescente: Encontre a maior sequência crescente de
        // números em um array e imprima os números dessa sequência.

        int[] array = { 3, 10, 4, 5, 6, 7, 8, 1 };

        List<Integer> sequencia = encontrarMaiorSequenciaCrescente(array);

        System.out.println("Maior sequência crescente encontrada:");
        for (int num : sequencia) {
            System.out.print(num + " ");
        }
    }

    public static List<Integer> encontrarMaiorSequenciaCrescente(int[] array) {
        if (array == null || array.length == 0) {
            return new ArrayList<>();
        }

        List<Integer> maiorSequencia = new ArrayList<>();
        List<Integer> subsequenciaAtual = new ArrayList<>();

        subsequenciaAtual.add(array[0]);

        for (int i = 1; i < array.length; i++) {
            if (array[i] > subsequenciaAtual.get(subsequenciaAtual.size() - 1)) {
                subsequenciaAtual.add(array[i]);
            } else {
                if (subsequenciaAtual.size() > maiorSequencia.size()) {
                    maiorSequencia = new ArrayList<>(subsequenciaAtual);
                }
                subsequenciaAtual.clear();
                subsequenciaAtual.add(array[i]);
            }
        }


        if (subsequenciaAtual.size() > maiorSequencia.size()) {
            maiorSequencia = new ArrayList<>(subsequenciaAtual);
        }

        return maiorSequencia;
    }


}
