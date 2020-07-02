package main.java;

import main.java.vo.Imovel;

public class MainPolimorfismo {
    public static void main(String[] args) {
        Imovel imovel1 = new Imovel("rua abacaxi natal", 100);

        System.out.println(imovel1);
        System.out.println(imovel1.calculaValor(78));
        System.out.println(imovel1);

    }

}
