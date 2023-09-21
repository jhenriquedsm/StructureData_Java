package com.jhenriquedsm.estruturadados.teste.vetor;

import com.jhenriquedsm.estruturadados.vetor.Lista;
import com.jhenriquedsm.estruturadados.vetor.VetorObjetos;

public class Aula11 {
    public static void main(String[] args) {

        Lista<Contato> vetor = new Lista<Contato>(1);
        Contato c1 = new Contato("Contato 1", "1111-2222", "contato1@gmail.com");

        vetor.adiciona(c1);
    }
}
