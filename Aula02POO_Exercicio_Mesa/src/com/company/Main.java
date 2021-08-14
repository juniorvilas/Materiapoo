package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Número: ");
        int num = entrada.nextInt();
        System.out.println(primo(num));
    }


    public static String primo(int num){
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return "Não é primo";
        }
        return "É primo";
    }
}


