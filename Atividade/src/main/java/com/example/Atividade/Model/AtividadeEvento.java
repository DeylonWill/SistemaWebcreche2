
package com.example.Atividade.Model;

/**
 *
 * @author Deylon
 */
public class AtividadeEvento {
    private String nome;
    private String data;
    private String descricao;

    public AtividadeEvento(String nome, String data, String descricao) {
        this.nome = nome;
        this.data = data;
        this.descricao = descricao;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }
}
