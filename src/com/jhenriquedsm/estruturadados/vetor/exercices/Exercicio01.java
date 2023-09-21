package com.jhenriquedsm.estruturadados.vetor.exercices;

import com.jhenriquedsm.estruturadados.vetor.Lista;

public class Exercicio01 {
    public static void main(String[] args) {

        Lista<String> lista = new Lista<>(3);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        System.out.println(lista.contains("A"));
        System.out.println(lista.contains("D"));

        boolean situation = lista.contains("B");
        if (situation) {
            System.out.println("Elemento encontrado!");
        } else {
            System.out.println("Elemento não encontrado!");
        }
    }
}
