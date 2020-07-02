package main.java;

import main.java.vo.Automóvel;
import main.java.vo.Concessionária;
import main.java.vo.Pessoa;

import javax.swing.table.AbstractTableModel;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // construtor sem parametro Pessoa
        Pessoa p = new Pessoa();

        p.setNome("Lais Sena");
        p.setCpf("1223");
        p.setDataNascimento(new Date(1992,10,01));
        p.setRg("4567");
        p.setIdade(27L);

        System.out.println("A idade do " + p.getNome() + " é: " + p.getIdade());
        System.out.println(p.getNome() + " nasceu em: " + p.getDataNascimento());
        System.out.println(p);

        // construtor com parametro Pessoa
        Pessoa p2= new Pessoa("Debora Aparecida","397100");



        // construtor sem parametro Automóvel

        Automóvel a = new Automóvel();

        a.setMarca("Chevrolet");
        a.setModelo("onix");
        a.setCor("azul");

        System.out.println("o carro " + a.getModelo() + " é da automotiva " + a.getMarca());
        System.out.println( "o " + a.getModelo()+  a.getCor () + " é o carro mais vendido");
        System.out.println(p);

        // construtor com parametro Automóvel

        Automóvel a2 = new Automóvel("Fiat","2009");



        // construtor sem parametro Concessionária

        Concessionária c = new Concessionária();

        c.setEndereço("Ruas das Arvores,13");
        c.setGerente("Tiago Ferreira");
        c.setNumeroTelefone("55223344");

        System.out.println("A loja mais movimentada fica na " + c.getEndereço());
        System.out.println(" O gerente " + c.getGerente() + " atende no telefone " + c.getNumeroTelefone());

        // construtor com parametro Concessionária

    }

}

