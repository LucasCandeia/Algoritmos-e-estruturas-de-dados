/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista_Encadeada;

import java.util.Scanner;

/**
 *
 * @author EAD
 */
public class Teste {

    public static void main(String[] args) {
        int opc;
        ListaSE lista = new ListaSE();
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Digite uma opc:\n"
                    + "1 - Iserir no inicio\n"
                    + "2 - Iserir no final\n"
                    + "3 - Localizar\n"
                    + "4 - Excluir numero\n"
                    + "5 - Imprimir lista\n"
                    + "6 - Quantidade de elementos\n"
                    + "7 - Inserir no meio\n"
                    + "8 - Sair");
            opc = scan.nextInt();
            if (opc == 1) {
                System.out.println("Digite um numero: ");
                int num = scan.nextInt();
                lista.inserirPrimeiro(num);
            }
            if (opc == 2) {
                System.out.println("Digite um numero: ");
                int num = scan.nextInt();
                lista.inserirUltimo(num);
            }
            if (opc == 3) {
                if (lista.getQuantNo() == 0 && lista.getPrimeiro() == null) {
                    System.out.println("Lista vazia!");
                } else {
                    System.out.println("Digite um numero: ");
                    int num = scan.nextInt();
                    System.out.println(lista.pesquisaNo(num));
                }
            }
            if (opc == 4) {
                if (lista.getQuantNo() == 0 && lista.getPrimeiro() == null) {
                    System.out.println("Lista vazia!");
                } else {
                    System.out.println("Digite um numero: ");
                    int num = scan.nextInt();
                    lista.removerNo(num);
                }
            }
            if (opc == 5) {
                lista.imprimirLista();
            }
            if (opc == 6) {
                System.out.println(lista.getQuantNo());
            }
            if(opc == 7){
                
                System.out.println("Digite um numero: ");
                int num = scan.nextInt();
                
                System.out.println("Digite uma posicao: ");
                int posicao = scan.nextInt();
                
                lista.inserirNoMeio(num, posicao);
            }
        } while (opc != 8);

    }

}
