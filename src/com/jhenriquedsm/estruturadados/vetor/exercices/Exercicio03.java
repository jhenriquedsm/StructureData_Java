package com.jhenriquedsm.estruturadados.vetor.exercices;

import com.jhenriquedsm.estruturadados.vetor.Lista;

public class Exercicio03 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");

        System.out.println(lista);

        lista.remover("D");
        System.out.println(lista);

        lista.remover("A");
        System.out.println(lista);
    }
}
