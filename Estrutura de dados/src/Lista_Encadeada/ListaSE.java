/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista_Encadeada;

/**
 *
 * @author EAD
 */
public class ListaSE {

    private No primeiro;
    private No ultimo;
    private int quantNo;

    public ListaSE() {
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
        }
        novo.setProx(this.primeiro);
        this.primeiro = novo;
        this.quantNo++;
    }

    public void inserirUltimo(int num) {
        No novo = new No(num);
        if (this.quantNo == 0 && this.primeiro == null) {
            this.primeiro = novo;
        } else {
            this.ultimo.setProx(novo);
        }
        this.ultimo = novo;
        this.quantNo++;
    }

    public boolean removerNo(int num) {
        No atual = this.primeiro;
        No anterior = null;

        if (this.primeiro == null && this.quantNo == 0) {
            return false;
        } else {
            for (int i = 0; i < this.quantNo; i++) {
                if (atual.getNum() == num) {
                    i = this.quantNo - 1;
                } else {
                    anterior = atual;
                    atual = atual.getProx();
                }
            }
            if (atual == this.primeiro) {
                if (this.primeiro == this.ultimo) {
                    this.ultimo = null;
                }
                this.primeiro = this.primeiro.getProx();
            } else {
                if (atual == this.ultimo) {
                    this.ultimo = anterior;
                }
                anterior.setProx(atual.getProx());
            }
            this.quantNo--;
            return true;
        }

    }

    private boolean posicaoOculpada(int posicao) {
        return posicao >= 0 && posicao < this.quantNo;
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
            No anterior = this.pegaNo(posicao - 1);
            if (anterior != null) {
                No novo = new No(num);
                novo.setProx(anterior.getProx());
                anterior.setProx(novo);
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
        for (int i = 0; i < this.quantNo; i++) {
            System.out.println(atual.getNum());
            atual = atual.getProx();
        }
        System.out.println(""
                + "------------------------------------------------------------------");
    }
}
