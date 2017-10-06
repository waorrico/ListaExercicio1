/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.lista1;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Exercicio15
{
    public static void main(String[] args) 
    {
        int qtdeEstoque;
        int qtdeMaxima;
        int qtdeMinima;
        int mediaEstoque;

        Scanner s = new Scanner(System.in);
        System.out.println("Entre com a Quantidade de Estoque Atual: ");
        qtdeEstoque = s.nextInt();
        System.out.println("Entre com a Quantidade Maxima de Estoque: ");
        qtdeMaxima = s.nextInt();
        System.out.println("Entre com a Quantidade Minima de Estoque: ");
        qtdeMinima = s.nextInt();
        
        mediaEstoque = (qtdeMaxima + qtdeMinima)/2;
        System.out.println("A Média do estoque é " + mediaEstoque );
        
        if (qtdeEstoque <= mediaEstoque) 
        {
            System.out.println("Não efetuar Compra");
        }
        else
        {
            System.out.println("Efetuar Compras");
        }
    }
}
