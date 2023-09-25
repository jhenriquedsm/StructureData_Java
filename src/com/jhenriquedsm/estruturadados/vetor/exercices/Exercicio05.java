package com.jhenriquedsm.estruturadados.vetor.exercices;

import com.jhenriquedsm.estruturadados.vetor.Lista;

import java.util.ArrayList;

public class Exercicio05 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(2);
        arrayList.add(5);
        System.out.println(arrayList);

        arrayList.clear();
        System.out.println(arrayList);

        Lista<Integer> lista = new Lista<>(2);
        lista.adiciona(2);
        lista.adiciona(5);
        System.out.println(lista);

        lista.limpar();
        System.out.println(lista);
    }
}
