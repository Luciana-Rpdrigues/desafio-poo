package com.luciana.desafio.dominio;

import java.time.LocalDate;

public class Servico extends Conteudo {

    private String carro;
    private int cargaHoraria;
    private LocalDate data;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(60);

    public Servico() {
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "titulo='" + getTitulo() + '\'' +
                "descricao='" + getDescricao() + '\'' +
                "carro='" + carro + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", data=" + data +
                ", dataInicial=" + dataInicial +
                ", dataFinal=" + dataFinal +
                '}';
    }

    @Override
    public double calcularOrc() {
        return ORC * cargaHoraria;
    }
}
