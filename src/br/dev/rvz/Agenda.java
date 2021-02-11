package br.dev.rvz;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private String nome;
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public void listarAgenda() {
        String agenda = "Nome da agenda: " + this.getNome() + " \n";
        for (Contato item : contatos) {
            agenda += "\n=========================================================";
            agenda += "\n" + item.toString();
        }
        IO.output(agenda);
    }
}
