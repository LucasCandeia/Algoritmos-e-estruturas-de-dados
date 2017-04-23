/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lisda_Duplamente_Encadeada;

import Lista_Encadeada.*;

/**
 *
 * @author EAD
 */
public class No {

    private int num;
    private No prox;
    private No ant;

    public No(int num) {
        this.num = num;
        this.prox = null;
        this.ant = null;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public No getAnt() {
        return ant;
    }

    public void setAnt(No ant) {
        this.ant = ant;
    }

}
