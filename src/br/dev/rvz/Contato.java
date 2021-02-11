package br.dev.rvz;

import java.util.ArrayList;
import java.util.List;

/**
 * modelo de contato principal de contato
 * */
public class Contato {

    private String nome;
    private Endereco endereco;
    private List<String> telefone = new ArrayList<>();

    public Contato() {
    }

    public Contato(String nome, Endereco endereco, List<String> telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<String> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<String> telefone) {
        this.telefone = telefone;
    }
}
