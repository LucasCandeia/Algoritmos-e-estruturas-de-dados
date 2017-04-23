/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilha;

/**
 *
 * @author EAD
 */
public class Pilha {

    private No primeiro;
    private No ultimo;
    private int quantNo;

    public Pilha() {
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
            this.ultimo = novo;
        }
        novo.setProx(this.primeiro);
        this.primeiro = novo;
        this.quantNo++;
    }

    public int removerNo() {
        
        No aux = this.primeiro;
        this.primeiro = this.primeiro.getProx();
        this.quantNo--;
        return aux.getNum();

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

    public void imprimirPilha() {
        No atual = this.primeiro;
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < this.quantNo; i++) {
            System.out.println(atual.getNum());
            atual = atual.getProx();
        }
        System.out.println("------------------------------------------------------------------");
    }
}
