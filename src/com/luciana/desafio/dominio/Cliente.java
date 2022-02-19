package com.luciana.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Cliente {

    private String nome;
    private Set<Conteudo> conteudosEntregues = new LinkedHashSet<>();
    private Set<Conteudo> getConteudosRetirados = new LinkedHashSet<>();

    public void entregarOficina(Oficina oficina) {
        this.conteudosEntregues.addAll(oficina.getConteudos());
        oficina.getClientesNovos().add(this);
    }

    public  void contratar() {
        Optional<Conteudo> conteudo = this.conteudosEntregues.stream().findFirst();
        if (conteudo.isPresent()) {
            this.getConteudosRetirados.add(conteudo.get());
            this.conteudosEntregues.remove(conteudo.get());
        }else {
            System.err.println("Você não tem carro nesta oficina!");
        }
    }

    public double calcularTotalOrc() {
        this.getConteudosRetirados
                .stream()
                .mapToDouble(Conteudo::calcularOrc)
                .sum();
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosEntregues() {
        return conteudosEntregues;
    }

    public void setConteudosEntregues(Set<Conteudo> conteudosEntregues) {
        this.conteudosEntregues = conteudosEntregues;
    }

    public Set<Conteudo> getGetConteudosRetirados() {
        return getConteudosRetirados;
    }

    public void setGetConteudosRetirados(Set<Conteudo> getConteudosRetirados) {
        this.getConteudosRetirados = getConteudosRetirados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nome, cliente.nome) && Objects.equals(conteudosEntregues, cliente.conteudosEntregues) && Objects.equals(getConteudosRetirados, cliente.getConteudosRetirados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosEntregues, getConteudosRetirados);
    }
}
