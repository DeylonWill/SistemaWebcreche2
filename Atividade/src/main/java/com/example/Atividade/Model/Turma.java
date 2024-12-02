
package com.example.Atividade.Model;

/**
 *
 * @author Deylon
 */
public class Turma {
    private String nome;
    private String horarios;

    public Turma(String nome, String horarios) {
        this.nome = nome;
        this.horarios = horarios;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getHorarios() {
        return horarios;
    }
}
