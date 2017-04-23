/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lisda_Duplamente_Encadeada;

/**
 *
 * @author EAD
 */
public class ListaDE {

    private No primeiro;
    private No ultimo;
    private int quantNo;

    public ListaDE() {
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

    public void inserirPrimeiro(int num) {
        No novo = new No(num);
        if (this.quantNo == 0 && this.primeiro == null) {
            this.ultimo = novo;
            this.primeiro = novo;
        }
        this.primeiro.setAnt(novo);
        novo.setProx(this.primeiro);
        this.primeiro = novo;
        this.quantNo++;
    }

    public void inserirUltimo(int num) {
        No novo = new No(num);
        if (this.quantNo == 0 && this.primeiro == null) {
            this.primeiro = novo;
        } else {
            novo.setAnt(this.ultimo);
            this.ultimo.setProx(novo);
        }
        this.ultimo = novo;
        this.quantNo++;
    }

    public boolean removerNo(int num) {
        No atual = this.primeiro;

        if (this.primeiro == null && this.quantNo == 0) {
            System.out.println("A lista está vazia!");
            return false;
        } else if (this.quantNo == 1) {
            this.primeiro = null;
            this.ultimo = null;
        } else {
            for (int i = 0; i < this.quantNo; i++) {
                if (atual.getNum() == num) {
                    i = this.quantNo - 1;
                } else {
                    atual = atual.getProx();
                }
            }
            if (atual == this.primeiro) {
                /*if (this.primeiro == this.ultimo) {
                    this.ultimo = null;
                    this.primeiro = null;
                }*/
                this.primeiro = this.primeiro.getProx();
                this.primeiro.setAnt(null);
            } else if (atual == this.ultimo) {
                this.ultimo = this.ultimo.getAnt();
                this.ultimo.setProx(null);
            } else {
                No antA = atual.getAnt();
                antA.setProx(atual.getProx());
                atual.getProx().setAnt(antA);
            }
        }

        this.quantNo--;
        return true;
    }

    private No pegaNo(int posicao) {
        if (posicao < 0 || posicao > this.quantNo) {
            System.out.println("O elemento nao existe!");
        } else {
            No atual = this.primeiro;
            for (int i = 0; i < posicao; i++) {
                atual = atual.getProx();
            }
            return atual;
        }
        return null;
    }

    public void inserirNoMeio(int num, int posicao) {
        if (posicao == 0) {
            inserirPrimeiro(num);
        } else if (posicao == this.quantNo) {
            inserirUltimo(num);
        } else {
            No atual = this.pegaNo(posicao - 1);
            if (atual != null) {
                No novo = new No(num);
                novo.setAnt(atual);
                No aux = atual.getProx();
                atual.setProx(novo);
                novo.setProx(aux);
                aux.setAnt(novo);
                this.quantNo++;
            }
        }

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

    public void imprimirLista() {
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
