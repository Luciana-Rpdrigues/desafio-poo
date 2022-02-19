package com.luciana.desafio.dominio;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Oficina {

    private String nome;
    private String descricao;
    private Set<Cliente> clientesNovos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Cliente> getClientesNovos() {
        return clientesNovos;
    }

    public void setClientesNovos(Set<Cliente> clientesNovos) {
        this.clientesNovos = clientesNovos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oficina oficina = (Oficina) o;
        return Objects.equals(nome, oficina.nome) && Objects.equals(descricao, oficina.descricao) && Objects.equals(clientesNovos, oficina.clientesNovos) && Objects.equals(conteudos, oficina.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, clientesNovos, conteudos);
    }
}
