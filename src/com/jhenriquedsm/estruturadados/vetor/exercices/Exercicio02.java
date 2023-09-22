package com.jhenriquedsm.estruturadados.vetor.exercices;

import com.jhenriquedsm.estruturadados.vetor.Lista;

import java.util.ArrayList;

public class Exercicio02 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(5);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("A");

        System.out.println(arrayList.lastIndexOf("A"));

        Lista<String> lista = new Lista<>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("A");
        lista.adiciona("A");
        lista.adiciona("B");

        System.out.println(lista.ultimoIndice("A"));
        System.out.println(lista.ultimoIndice("B"));
    }
}
