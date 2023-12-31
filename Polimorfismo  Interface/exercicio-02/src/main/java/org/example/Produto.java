package org.example;

public abstract class Produto implements Vendavel {

    //Atributos
    private Integer codigo;
    private Double precoCusto;

    //Construtor
    public Produto(Integer codigo, Double precoCusto) {
        this.codigo = codigo;
        this.precoCusto = precoCusto;
    }

    //Get e setter
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }

    //ToString
    @Override
    public String toString() {
        return String.format("🛒 Produto: Codigo %d, PreçoCusto: %.2f",
                codigo, precoCusto);
    }
}
