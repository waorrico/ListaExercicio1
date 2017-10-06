/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.lista1;
import java.util.Scanner;

/**
 *
 * @author alunoadm
 */
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1;
        int n2;
        String Operacao;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite 0 para efetuar uma Soma.");
        System.out.println("Digite 1 para efetuar uma Subtração.");
        System.out.println("Digite 2 para efetuar uma Divisão");
        System.out.println("Digite 3 para efetuar uma Multiplicação");
        System.out.println("Digite a operação que deseja efetuar: ");
        Operacao = entrada.next();        
        
        System.out.println("Digite o Primeiro Numero: ");
        n1 = entrada.nextInt();

        System.out.println("Digite o Segundo Numero: ");
        n2 = entrada.nextInt();
        
        switch (Operacao){
            case "0":
                System.out.println("O resultado da Soma é: " + (n1+n2));
            case "1":
                System.out.println("O resultado da subtração é: " + (n1-n2));
            case "2":
                System.out.println("O resultado da divisão é: " + (n1/n2));
            case "3":
                System.out.println("O resultado da multiplicação é: " + (n1*n2));
            }
        
    }
    
}
