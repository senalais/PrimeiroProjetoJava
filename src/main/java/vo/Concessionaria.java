package main.java.vo;

public class Concessionaria {

    //ATRIBUTO
    private String endereço;
    private String numeroTelefone;
    private String gerente;


    public Concessionaria() {
    }

    public Concessionaria(String endereço, String numeroTelefone) {
        this.endereço = endereço;
        this.numeroTelefone = numeroTelefone;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
}



