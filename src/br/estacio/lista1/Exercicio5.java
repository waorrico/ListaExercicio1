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
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 3;
        int b = 1;
        int c = b + 1;
        int d = c > ++b ? (a - 3) : b;
        int e = 4;
        if( d > a && b + 1 < a || b > 1)
        c += 7;
        if( -7 >= -c)
        a -= 4;
        else
        d *= 2;
        e = ++d % 3;
        b = d++ % 3;
        System.out.println("Resultado de A:" + a);
        System.out.println("Resultado de B:" + b);
        System.out.println("Resultado de C:" + c);
        System.out.println("Resultado de D:" + d);
        System.out.println("Resultado de E:" + e);
    }
    
}
