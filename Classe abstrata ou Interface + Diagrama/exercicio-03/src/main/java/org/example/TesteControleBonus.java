package org.example;

public class TesteControleBonus {
    public static void main(String[] args) {
        //Instanciando ControleBonus
        ControleBonus controle = new ControleBonus();

        //Instanciando Professor
        Professor professor = new Professor("Alan",30,40.50);

        //Instanciando Coordenador
        Coordenador coordenador = new Coordenador("Marina",30,40.50);


        //Métodos
        controle.adicionaBonificavel(professor);
        controle.adicionaBonificavel(coordenador);
        System.out.println("\n 💵 O Bonus total é: ");
        System.out.println(controle.calculaTotalBonus());
        System.out.println("\n");
        controle.exibeTodos();
    }

}
