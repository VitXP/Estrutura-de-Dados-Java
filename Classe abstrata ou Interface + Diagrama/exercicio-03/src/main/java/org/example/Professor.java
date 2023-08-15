package org.example;

public class Professor extends Funcionario implements Bonificavel {

    //Atributos
    private Integer qtdAulaSemana;
    private Double valorHoraAula;

    //Construtor
    public Professor(String nome, Integer qtdAulaSemana, Double valorHoraAula) {
        super(nome);
        this.qtdAulaSemana = qtdAulaSemana;
        this.valorHoraAula = valorHoraAula;
    }

    //Get e setter
    public Integer getQtdAulaSemana() {
        return qtdAulaSemana;
    }

    public void setQtdAulaSemana(Integer qtdAulaSemana) {
        this.qtdAulaSemana = qtdAulaSemana;
    }

    public Double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(Double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    //Métodos
    @Override
    public Double getValorBonus() {
        return (qtdAulaSemana* valorHoraAula) * 4.5 * 0.15;
    }

    //ToString
    @Override
    public String toString() {
        return String.format("%S Professor: qtdAulaSemana %d, valorHoraAula: %.2f",
                super.toString(),qtdAulaSemana, valorHoraAula);
    }
}
