package main.java.vo;

import java.util.Date;

public class Cliente  extends Pessoa {

    private String codCliente;
    private String ultimaCompra;
    private String telefone;

    public Cliente(String codCliente, String ultimaCompra, String telefone) {
        this.codCliente = codCliente;
        this.ultimaCompra = ultimaCompra;
        this.telefone = telefone;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getUltimaCompra() {
        return ultimaCompra;
    }

    public void setUltimaCompra(String ultimaCompra) {
        this.ultimaCompra = ultimaCompra;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
