package Atividade02;

import java.util.HashSet;
import java.util.Set;

public class At09 {
    public static void main(String[] args) {

        //9. Subconjuntos de Soma Zero: Determine se existe um subconjunto não vazio
        // de elementos em um array cuja soma seja igual a zero.

        int[] array = { 2, 3, -2, 1, 0 };

        boolean existeSubconjuntoSomaZero = temSubconjuntoSomaZero(array);

        if (existeSubconjuntoSomaZero) {
            System.out.println("Existe um subconjunto com soma zero no array.");
        } else {
            System.out.println("Não existe subconjunto com soma zero no array.");
        }
    }

    public static boolean temSubconjuntoSomaZero(int[] array) {
        Set<Integer> somasParciais = new HashSet<>();
        int somaAtual = 0;

        for (int num : array) {
            somaAtual += num;

            if (somasParciais.contains(somaAtual) || somaAtual == 0) {
                return true;
            }

            somasParciais.add(somaAtual);
        }

        return false;

    }
}
