package com.luciana.desafio.dominio;

public class Carro extends Conteudo {

    private String cor;
    private String marca;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "titulo='" + getTitulo() + '\'' +
                ", descrição='" + getDescricao() + '\'' +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    @Override
    public double calcularOrc() {
        return 0;
    }
}