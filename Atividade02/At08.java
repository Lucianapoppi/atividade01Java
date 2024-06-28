package Atividade02;

import java.util.HashMap;
import java.util.Map;

public class At08 {
    public static void main(String[] args) {

       //8. Histograma de Frequência: Construa um histograma de frequência a partir
        // de um array de números, mostrando quantas vezes cada número aparece.

        int[] array = { 1, 3, 5, 3, 7, 9, 1, 3, 5, 5 };

        Map<Integer, Integer> frequencia = gerarHistograma(array);

        System.out.println("Histograma de Frequência:");
        for (Map.Entry<Integer, Integer> entry : frequencia.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<Integer, Integer> gerarHistograma(int[] array) {
        Map<Integer, Integer> frequencia = new HashMap<>();

        for (int num : array) {
            if (frequencia.containsKey(num)) {
                frequencia.put(num, frequencia.get(num) + 1);
            } else {
                frequencia.put(num, 1);
            }
        }

        return frequencia;

    }
}
