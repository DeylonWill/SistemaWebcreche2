
package com.example.Atividade.Model;


/**
 *
 * @author Deylon
 */

public class Crianca {
    private String nome;
    private String responsavel;
    private int idade;
    private String contato;

    public Crianca(String nome, String responsavel, int idade, String contato) {
        this.nome = nome;
        this.responsavel = responsavel;
        this.idade = idade;
        this.contato = contato;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public int getIdade() {
        return idade;
    }

    public String getContato() {
        return contato;
    }
}
