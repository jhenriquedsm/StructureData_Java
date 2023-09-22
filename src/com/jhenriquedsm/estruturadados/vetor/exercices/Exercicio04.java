package com.jhenriquedsm.estruturadados.vetor.exercices;

import com.jhenriquedsm.estruturadados.vetor.Lista;

import java.util.ArrayList;

public class Exercicio04 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");

        System.out.println(lista.obtem(3));
    }
}
