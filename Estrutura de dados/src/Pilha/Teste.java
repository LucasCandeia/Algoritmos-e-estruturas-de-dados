/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilha;

import java.util.Scanner;

/**
 *
 * @author EAD
 */
public class Teste {

    public static void main(String[] args) {
        int opc;
        Pilha Pilha = new Pilha();
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Digite uma opc:\n"
                    + "1 - Iserir\n"
                    + "2 - Localizar\n"
                    + "3 - Excluir\n"
                    + "4 - Imprimir pilha\n"
                    + "5 - Quantidade de elementos\n"
                    + "6 - Sair");
            opc = scan.nextInt();
            if (opc == 1) {
                System.out.println("Digite um numero: ");
                int num = scan.nextInt();
                Pilha.inserir(num);
            }
            
            if (opc == 2) {
                if (Pilha.getQuantNo() == 0 && Pilha.getPrimeiro() == null) {
                    System.out.println("Pilha vazia!");
                } else {
                    System.out.println("Digite um numero: ");
                    int num = scan.nextInt();
                    System.out.println(Pilha.pesquisaNo(num));
                }
            }
            if (opc == 3) {
                if (Pilha.getQuantNo() == 0 && Pilha.getPrimeiro() == null) {
                    System.out.println("Lista vazia!");
                } else {
                    Pilha.removerNo();
                }
            }
            if (opc == 4) {
                Pilha.imprimirPilha();
            }
            if (opc == 5) {
                System.out.println(Pilha.getQuantNo());
            }
        } while (opc != 6);

    }

}
