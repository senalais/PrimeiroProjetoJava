package main.java.vo;

import java.util.Date;

public class Funcionario extends Pessoa {

    private String admissao;
    private String loja;
    private String departamento;

    public Funcionario(String admissao, String loja, String departamento) {
        this.admissao = admissao;
        this.loja = loja;
        this.departamento = departamento;
    }

    public String getAdmissao() {
        return admissao;
    }

    public void setAdmissao(String admissao) {
        this.admissao = admissao;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
