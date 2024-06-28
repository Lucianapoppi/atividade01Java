package Atividade02;

import java.util.Arrays;

public class at02 {
    public static void main(String[] args) {
        //2. Fusão de Arrays: Crie um método que receba dois arrays de inteiros ordenados
        // e os funda em um único array ordenado.

        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};

        int[] merged = mergeSortedArrays(arr1, arr2);

        System.out.println("Arrays originais:");
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));

        System.out.println("\nArray combinado ordenado:");
        System.out.println(Arrays.toString(merged));
    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;


        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }


        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }


        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }

}
