package main.java.vo;

import java.util.Date;

public class Automovel {

    // ATRIBUTO
    private String marca;
    private String modelo;
    private String cor;
    private Date Ano;

    public Automovel(String fiat, String s) {
    }

    public Automovel(String marca, Date ano) {
        this.marca = marca;
        Ano = ano;
    }

    public Automovel() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Date getAno() {
        return Ano;
    }


    //
    @Override
    public String toString() {
        return "Automóvel{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", Ano=" + Ano +
                '}';
    }

    public void setAno(Date ano) {
        Ano = ano;


    }
}




