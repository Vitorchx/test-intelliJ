package br.com.dio.Calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();

        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multplicar(a ,b);
        float dividir = dividir(a, b);

        System.out.println("Soma:" + somar);
        System.out.println("Subt: " + subtrair);
        System.out.println("mult: " + multiplicar);
        System.out.println("div: " + dividir);


    }


    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multplicar(int a, int b) {
        return a * b;
    }

    public static float dividir(float a, float b) {
        return (a / b);
    }


}

        