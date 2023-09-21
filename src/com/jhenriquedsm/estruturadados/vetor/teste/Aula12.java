package com.jhenriquedsm.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        // metódo adiciona
        arrayList.add("A");
        arrayList.add("C");
        System.out.println(arrayList);

        // adiciona com posição
        arrayList.add(1, "B");
        System.out.println(arrayList);

        // metódo buscar
        boolean contains = arrayList.contains("A");
        if (contains){
            System.out.println("Elemento encontrado!");
        } else {
            System.out.println("Elemento não encontrado!");
        }

        // metódo buscar implementado na classe Vetor
        int pos = arrayList.indexOf("B");
        if (pos > -1){
            System.out.println("Elemento encontrado!");
        } else {
            System.out.println("Elemento não encontrado!");
        }
        System.out.println(arrayList.get(1));

        // metódo remover
        arrayList.remove(0);
        arrayList.remove("B");

        System.out.println(arrayList);

        // metodo tamanho
        int tamanho = arrayList.size();
        System.out.println("Tamanho = " + tamanho);
    }
}
