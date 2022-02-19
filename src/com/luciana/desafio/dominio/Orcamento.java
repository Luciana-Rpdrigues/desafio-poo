package com.luciana.desafio.dominio;

public class Orcamento extends Conteudo {

    private double valor;
    private String peca;
    private double maoDeObra;
    private String material;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getPeca() {
        return peca;
    }

    public void setPeca(String peca) {
        this.peca = peca;
    }

    public double getMaoDeObra() {
        return maoDeObra;
    }

    public void setMaoDeObra(double maoDeObra) {
        this.maoDeObra = maoDeObra;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Orcamento{" +
                "titulo='" + getTitulo() + '\'' +
                "descricao='" + getDescricao() + '\'' +
                "valor=" + valor +
                ", peca='" + peca + '\'' +
                ", maoDeObra='" + maoDeObra + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
    @Override
    public double calcularOrc() {
        return ORC + 20d;
    }
}
