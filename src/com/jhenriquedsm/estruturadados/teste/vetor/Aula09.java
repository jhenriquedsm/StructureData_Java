package com.jhenriquedsm.estruturadados.teste.vetor;

import com.jhenriquedsm.estruturadados.vetor.Vetor;

public class Aula09 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        vetor.adiciona("B");
        vetor.adiciona("G");
        vetor.adiciona("D");
        vetor.adiciona("E");
        vetor.adiciona("F");

        System.out.println(vetor);

        vetor.remover(1);
        System.out.println(vetor);

        System.out.println("Removendo o elemento E");
        int posicao = vetor.busca("E");
        if(posicao > -1){
            vetor.remover(posicao);
        } else {
            System.out.println("Elemento não encontrado!");
        }
        System.out.println(vetor);
    }
}
