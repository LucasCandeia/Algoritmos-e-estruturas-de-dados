/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fila;

import java.util.Scanner;

/**
 *
 * @author EAD
 */
public class Teste {

    public static void main(String[] args) {
        int opc;
        Fila fila = new Fila();
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Digite uma opc:\n"
                    + "1 - Iserir\n"
                    + "2 - Localizar\n"
                    + "3 - Remover\n"
                    + "4 - Imprimir fila\n"
                    + "5 - Quantidade de elementos\n"
                    + "6 - Sair");
            opc = scan.nextInt();

            if (opc == 1) {
                System.out.println("Digite um numero: ");
                int num = scan.nextInt();
                fila.inserir(num);
            }
            if (opc == 2) {
                if (fila.getQuantNo() == 0 && fila.getPrimeiro() == null) {
                    System.out.println("Fila vazia!");
                } else {
                    System.out.println("Digite um numero: ");
                    int num = scan.nextInt();
                    System.out.println(fila.pesquisaNo(num));
                }
            }
            if (opc == 3) {
                if (fila.getQuantNo() == 0 && fila.getPrimeiro() == null) {
                    System.out.println("Lista vazia!");
                } else {
                    fila.removerNo();
                }
            }
            if (opc == 4) {
                fila.imprimirFila();
            }
            if (opc == 5) {
                System.out.println(fila.getQuantNo());
            }
        } while (opc != 6);

    }

}
