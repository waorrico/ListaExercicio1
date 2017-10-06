/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.lista1;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author USUARIO
 */
public class Exercicio13 {
    
public static void main(String[] args)
    {
        int qtdeComprada;
        double valorDaCompra;
        Scanner s = new Scanner (System.in);
        System.out.println("Digite a Quantidade Comprada de Maçãs: ");
        qtdeComprada = s.nextInt();
        DecimalFormat df = new DecimalFormat("0.00");
        if (qtdeComprada > 12)
        {
            valorDaCompra = qtdeComprada * 1.00;
            System.out.println("O Valor da Compra é: "+ df.format(valorDaCompra));
        }
        else
        {
            valorDaCompra = qtdeComprada * 1.30;
            System.out.println("O Valor da Compra é: "+ df.format(valorDaCompra));
        }
    }
    
}
