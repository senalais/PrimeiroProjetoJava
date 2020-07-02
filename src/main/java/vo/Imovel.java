package main.java.vo;

public class Imovel {

    private double valor;
    private String localizacao;
    private long areaConstruida;

    public Imovel(String localizacao, long areaConstruida) {
        this.localizacao = localizacao;
        this.areaConstruida = areaConstruida;
    }

    public String calculaValor (long areaConstruida) {
        double valor;
        if (areaConstruida <= 0) {
            valor = 0;
        } else {
            valor = areaConstruida * 20000;

        }
        return " o valor da area construida e " + valor + " se area contruida for " + areaConstruida;
    }

    public String calculaValor () {
        String retorno = null;
        if (this.areaConstruida <=0) {
            this.valor = 0;
        } else {
            this.valor = this.areaConstruida * 20000;

        }
        retorno = " o valor da area construida e " + this.valor;

        return retorno;

    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public long getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(long areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    @Override
    public String toString() {
        return " imovel (valor = " + valor + " area construida = " + areaConstruida + " localização = " + localizacao + ")";
    }
}
