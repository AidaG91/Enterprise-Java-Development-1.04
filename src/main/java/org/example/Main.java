package org.example;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {5, 12, 27, 38, 42};
        int result = Task1.getDifference(numbers);
        System.out.println("La diferencia es: " + result);

        int[] valores = {9, 2, 25, 89, -12, 72};
        Task2.findSmallest(valores);

        double resultado = Task3.calculateMath(3, 10);
        System.out.println("El resultado es: " + resultado);

    }
}