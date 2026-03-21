package org.example;

public class SessaoBancaria {

    private SessaoBancaria() {

    };

    private static SessaoBancaria instance = new SessaoBancaria();

    public static SessaoBancaria getInstance() {
        return instance;
    }

    private String nomeAgencia;
    private String gerenteLogado;
    private String codigoAgencia;
    private String moedaBase;

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public String getGerenteLogado() {
        return gerenteLogado;
    }

    public void setGerenteLogado(String gerenteLogado) {
        this.gerenteLogado = gerenteLogado;
    }

    public String getCodigoAgencia() {
        return codigoAgencia;
    }

    public void setCodigoAgencia(String codigoAgencia) {
        this.codigoAgencia = codigoAgencia;
    }

    public String getMoedaBase() {
        return moedaBase;
    }

    public void setMoedaBase(String moedaBase) {
        this.moedaBase = moedaBase;
    }
}