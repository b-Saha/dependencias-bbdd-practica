package com.myhome.app.main;

import java.util.Scanner;

import com.myhome.app.DATABASE.operaciones;

/**
 * Hello world!
 *
 */
public class App 
{
     public static void main (String [] args) {
        int num_1, num_2, total; 
        Scanner sc = new Scanner(System.in);

        operaciones b = new operaciones();

        System.out.println("Introduzca dos numeros para obtener su suma");
        num_1 = sc.nextInt();
        num_2 = sc.nextInt();

        total = b.sumarNumeros(num_1, num_2);
        System.out.println("La suma es: " +total);

        sc.close();
    }
}
