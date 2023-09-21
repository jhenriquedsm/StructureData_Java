package com.jhenriquedsm.estruturadados.vetor.teste;

import com.jhenriquedsm.estruturadados.vetor.VetorObjetos;

import java.util.Objects;

public class Contato {
    private String nome;
    private String telefone;
    private String email;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public Contato(){};

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato [" + "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome) && Objects.equals(telefone, contato.telefone) && Objects.equals(email, contato.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, telefone, email);
    }

    public static class Aula10 {
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
}
