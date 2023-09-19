package com.jhenriquedsm.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private Integer tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(String elemento) {
        this.aumentarCapacidade();
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, String elemento){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida!");
        }

        this.aumentarCapacidade();

        // movendo os elementos
        for(int i = tamanho - 1; i >= posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    private void aumentarCapacidade(){
        if (this.tamanho == this.elementos.length){
            String[] elementosNovos = new String[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public int tamanho(){
        return this.tamanho;
    }

    public String busca(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida!");
        }
        return this.elementos[posicao];
    }

    public int busca(String elemento){
        for (int i = 0; i < this.tamanho; i++){
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho - 1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0){
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }
}