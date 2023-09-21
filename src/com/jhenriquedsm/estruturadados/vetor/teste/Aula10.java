package com.jhenriquedsm.estruturadados.vetor.teste;

import com.jhenriquedsm.estruturadados.vetor.VetorObjetos;

public class Aula10 {
    public static void main(String[] args) {
        VetorObjetos vetor = new VetorObjetos(3);

        Contato c1 = new Contato("Contato 1", "1111-2222", "contato1@gmail.com");
        Contato c2 = new Contato("Contato 2", "3333-4444", "contato2@gmail.com");
        Contato c3 = new Contato("Contato 3", "5555-6666", "contato3@gmail.com");
        Contato c4 = new Contato("Contato 1", "1111-2222", "contato1@gmail.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("Tamanho = " + vetor.tamanho());

        int pos = vetor.busca(c4);
        if (pos > -1){
            System.out.println("Elemento encontrado!");
        } else {
            System.out.println("Elemento não encontrado!");
        }

        System.out.println(vetor);
    }
}
