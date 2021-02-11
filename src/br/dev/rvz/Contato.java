package br.dev.rvz;

import java.util.ArrayList;
import java.util.List;

/**
 * modelo de contato principal de contato
 * */
public class Contato {

    private String nome;
    private Endereco endereco;
    private List<String> telefones = new ArrayList<>();

    public Contato() {
    }

    public Contato(String nome, Endereco endereco, List<String> telefones) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefones = telefones;
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

    public List<String> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<String> telefone) {
        this.telefones = telefone;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", telefones=" + telefones +
                '}';
    }
}
