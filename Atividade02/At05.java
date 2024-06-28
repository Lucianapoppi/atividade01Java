package Atividade02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class At05 {
    public static void main(String[] args) {
        //5. Operações de Conjunto: Escreva funções que realizem operações de
        // união, interseção e diferença entre dois arrays.


        Integer[] array1 = { 1, 2, 3, 4, 5 };
        Integer[] array2 = { 3, 5, 7, 9 };


        Integer[] uniao = union(array1, array2);
        System.out.println("União dos arrays: " + Arrays.toString(uniao));


        Integer[] intersecao = intersection(array1, array2);
        System.out.println("Interseção dos arrays: " + Arrays.toString(intersecao));


        Integer[] diferenca = difference(array1, array2);
        System.out.println("Diferença (array1 - array2): " + Arrays.toString(diferenca));
    }


    public static <T> T[] union(T[] array1, T[] array2) {
        Set<T> set = new HashSet<>();
        set.addAll(Arrays.asList(array1));
        set.addAll(Arrays.asList(array2));
        return set.toArray(Arrays.copyOf(array1, 0));
    }


    public static <T> T[] intersection(T[] array1, T[] array2) {
        Set<T> set1 = new HashSet<>(Arrays.asList(array1));
        Set<T> set2 = new HashSet<>(Arrays.asList(array2));
        set1.retainAll(set2);
        return set1.toArray(Arrays.copyOf(array1, 0));
    }


    public static <T> T[] difference(T[] array1, T[] array2) {
        Set<T> set1 = new HashSet<>(Arrays.asList(array1));
        Set<T> set2 = new HashSet<>(Arrays.asList(array2));
        set1.removeAll(set2);
        return set1.toArray(Arrays.copyOf(array1, 0));
    }


}
