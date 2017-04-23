/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fila;

/**
 *
 * @author EAD
 */
public class Fila {

    private No primeiro;
    private No ultimo;
    private int quantNo;

    public Fila() {
        this.primeiro = null;
        this.ultimo = null;
        this.quantNo = 0;
    }

    public No getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public No getUltimo() {
        return ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    public int getQuantNo() {
        return quantNo;
    }

    public void setQuantNo(int quantNo) {
        this.quantNo = quantNo;
    }

    public void inserir(int num) {
        No novo = new No(num);
        if (this.quantNo == 0 && this.primeiro == null) {
            this.primeiro = novo;
        } else {
            this.ultimo.setProx(novo);
        }
        this.ultimo = novo;
        this.quantNo++;
    }

    public No removerNo() {
        No saida = this.primeiro;
        primeiro = primeiro.getProx();
        this.quantNo--;
        return saida;
    }

    public String pesquisaNo(int num) {
        No atual = this.primeiro;
        for (int i = 0; i < this.quantNo; i++) {
            if (atual.getNum() == num) {
                return i + "";
            } else {
                atual = atual.getProx();
            }
        }
        return "Numero não encontrado";
    }

    public void imprimirFila() {
        No atual = this.primeiro;
        System.out.println("------------------------------------------------------------------");
        System.out.print("[");
        for (int i = 0; i < this.quantNo; i++) {
            System.out.print(atual.getNum());
            if (i < this.quantNo - 1) {
                System.out.print(", ");
            }
            atual = atual.getProx();
        }
        System.out.println("]");
        System.out.println("------------------------------------------------------------------");
    }
}
