package com.jhenriquedsm.estruturadados;

import com.jhenriquedsm.estruturadados.teste.vetor.Contato;
import com.jhenriquedsm.estruturadados.vetor.VetorObjetos;

public class Aula10 {
    public static void main(String[] args) {
        VetorObjetos vetor = new VetorObjetos(3);

        Contato c1 = new Contato("Contato 1", "4444-5555", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "6666-7777", "contato2@email.com");
        Contato c3 = new Contato("Contato 3", "8888-9999", "contato3@email.com");
        Contato c4 = new Contato("Contato 1", "4444-5555", "contato1@email.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("Tamanho = " + vetor.tamanho());

        int pos = vetor.busca(c4);
        if(pos > -1){
            System.out.println("Elemento encontrado!");
        } else {
            System.out.println("Elemento não encontrado!");
        }

        System.out.println(vetor);

    }
}
