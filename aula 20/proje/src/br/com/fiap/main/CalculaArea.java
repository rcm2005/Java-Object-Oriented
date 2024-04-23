package br.com.fiap.main;

import java.util.Scanner;

public class CalculaArea {
    public static void main(String[] args) {
        
        int aux;

        Scanner scan = new Scanner(System.in);

        System.out.println("-------------------------------");
        System.out.println("--------Seja bem vindo!--------");
        System.out.println("Escolha uma das opções abaixo: ");
        System.out.println("      1 - Area quadrado");
        System.out.println("      2 - Area Retangulo");
        System.out.println("      3 - Area Triângulo");
        System.out.println("-------------------------------");
        aux = scan.nextInt();

        if (aux == 1){
            System.out.println();
        }
    }
    
}
