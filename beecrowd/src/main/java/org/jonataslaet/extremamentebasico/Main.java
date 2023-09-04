package org.jonataslaet.extremamentebasico;

import java.util.Scanner;

//https://www.beecrowd.com.br/judge/pt/problems/view/1001
public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int A, B, X;
        A = teclado.nextInt();
        B = teclado.nextInt();

        X = A + B;

        System.out.printf("X = %d\n", X);
    }
}