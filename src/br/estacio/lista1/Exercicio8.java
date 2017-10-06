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
public class Exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nt1;
        int nt2;
        double media;
        
        Scanner notaMedia = new Scanner (System.in);
        
        System.out.println("Digite a nota 1: ");
        nt1 = notaMedia.nextInt();
        
        System.out.println("Digite a nota 2: ");
        nt2 = notaMedia.nextInt ();
        
        media = (nt1 + nt2) /2;
        if (media >= 6){
            System.out.println("Você foi aprovado!");
        } else{
            System.out.println("Você foi reprovado!");
        }
    }
    
}
