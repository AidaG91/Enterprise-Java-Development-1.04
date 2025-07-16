package org.example;

public class Task2 {
    public static void findSmallest(int[] array) {

        int min = array[0];
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array.length < 2) {
                System.out.println("El array debe contener al menos dos elementos.");
                return;
            }
            if (array[i] < min) {
                min2 = min;
                min = array[i];
            } else if (array[i] < min2 && array[i] != min) {
                min2 = array[i];
            }
        }
        System.out.println(min + " es el elemento más pequeño.");
        System.out.println(min2 + " es el segundo elemento más pequeño.");
    }
}
