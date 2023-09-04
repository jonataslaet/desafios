package org.jonataslaet.primorapido;

import java.util.Scanner;

//https://www.beecrowd.com.br/judge/pt/problems/view/1221
public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int n, x, i = 0;

        n = keyboard.nextInt();
        while (i < n) {
            x = keyboard.nextInt();
            if (!isPrime(x)) {
                System.out.println("Not Prime");
            } else {
                System.out.println("Prime");
            }
            i++;
        }
        
    }

    private static boolean isPrime(int x) {
        int q = 1, d = 0;
        double r = Math.floor(Math.sqrt(x));
        while (q <= r) {
            if (x % q == 0) {
                d++;
                if (d > 1) return false;
            }
            q = q + 1;
        }
        return true;
    }
}