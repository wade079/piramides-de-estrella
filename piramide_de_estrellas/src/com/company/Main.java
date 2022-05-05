package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        
        System.out.println("piramide de estrellas");
        System.out.println("poner valor numerico");

        Scanner valor = new Scanner(System.in);
        int numero = valor.nextInt();

        for (int altura = 0; altura <= numero; altura++) {

            for (int blancos = 0; blancos <= numero - altura; blancos++) {
                System.out.print(" ");

            }

            for (int asterisco = 0; asterisco <= (altura * 2) - 2; asterisco++) {
                System.out.print("*");

            }

            System.out.println();
            valor.close();

        }

    }

}
