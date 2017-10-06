/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.lista1;

/**
 *
 * @author alunoadm
 */
public class Exercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c = 1;
        c = 0;
        System.out.println(c--);
        System.out.println(++c);
        System.out.println(c);
        
        c -= --c - c++;
        
        System.out.println(c--);
        System.out.println(++c);
        System.out.println(c);
        
        //Será exibido 6 linhas, todas contendo o valor 0 (zero).
    }
    
}
