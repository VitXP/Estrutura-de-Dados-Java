package org.example;

import java.util.ArrayList;
import java.util.List;

public class ControleBonus {

    //Atributos
    private List<Bonificavel> boni;

    //Construtor
    public ControleBonus() {
        this.boni = new ArrayList<>();;
    }

    //Métodos

    public void adicionaBonificavel(Bonificavel b) {
        boni.add(b);
    }

    public void exibeTodos() {
        for (Bonificavel b : boni) {
            System.out.println(b);
        }
    }

    public Double calculaTotalBonus() {

        Double bonus = 0.0;

        for (Bonificavel b : boni) {
            bonus += b.getValorBonus();
        }

        return bonus;
    }





}
