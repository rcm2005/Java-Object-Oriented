package br.com.fiap.main;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.fiap.bean.Quadrado;
import br.com.fiap.bean.Retangulo;

public class CalculaArea {
    public static void main(String[] args) {
        
        int opcao;
        String auxs;
        float lado, altura, area;


        Scanner scan = new Scanner(System.in);

        System.out.println("-------------------------------");
        System.out.println("--------Seja bem vindo!--------");
        System.out.println("Escolha uma das opções abaixo: ");
        System.out.println("      1 - Area quadrado");
        System.out.println("      2 - Area Retangulo");
        System.out.println("      3 - Area Triângulo");
        System.out.println("-------------------------------");
        opcao = scan.nextInt();


        switch (opcao) {
            case 1:
                Quadrado quad;


                auxs = JOptionPane.showInputDialog("Por favor digite um valor para o lado: ");
                lado = Float.parseFloat(auxs);
                quad = new Quadrado(lado);
                area = quad.calcularArea();
                JOptionPane.showMessageDialog(null, "a área do quadrado é " + area);
                break;
            case 2:
                Retangulo ret;

                auxs = JOptionPane.showInputDialog("Por favor digite o lado do retângulo: ");
                lado = Float.parseFloat(auxs);
                auxs = JOptionPane.showInputDialog("Por favor digite a altura do retângulo");
                altura = Float.parseFloat(auxs);
                ret = new Retangulo(altura);
                System.out.println(ret.calcularArea());
                
                    
                
                break;
            default:
                break;
        }
    }
    
}
