package org.example;

public class Coordenador extends Funcionario implements Bonificavel{

    // Atributos
    private Integer qtdHorasCoordenador;
    private Double valorHoraCord;

    // Construtor
    public Coordenador(String nome, Integer qtdHorasCoordenador, Double valorHoraCord) {
        super(nome);
        this.qtdHorasCoordenador = qtdHorasCoordenador;
        this.valorHoraCord = valorHoraCord;
    }

    // Get e setter
    public Integer getQtdHorasCoordenador() {
        return qtdHorasCoordenador;
    }

    public void setQtdHorasCoordenador(Integer qtdHorasCoordenador) {
        this.qtdHorasCoordenador = qtdHorasCoordenador;
    }

    public Double getValorHoraCord() {
        return valorHoraCord;
    }

    public void setValorHoraCord(Double valorHoraCord) {
        this.valorHoraCord = valorHoraCord;
    }

    // Métodos
    @Override
    public Double getValorBonus() {
        return (qtdHorasCoordenador * valorHoraCord) * 4.5 * 0.2;
    }

    //ToString
    @Override
    public String toString() {
        return String.format("%S Coordenador: qtdHorasCord %d, valorHoraCord: %.2f",
                super.toString(),qtdHorasCoordenador, valorHoraCord);
    }
}
