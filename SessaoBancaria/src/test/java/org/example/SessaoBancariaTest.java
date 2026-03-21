package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SessaoBancariaTest {

    @Test
    public void deveRetornarNomeAgencia() {
        SessaoBancaria.getInstance().setNomeAgencia("Banco do Brasil");
        assertEquals("Banco do Brasil", SessaoBancaria.getInstance().getNomeAgencia());
    }

    @Test
    public void deveRetornarGerenteLogado() {
        SessaoBancaria.getInstance().setGerenteLogado("Vítor Rosa");
        assertEquals("Vítor Rosa", SessaoBancaria.getInstance().getGerenteLogado());
    }

    @Test
    public void deveRetornarCodigoAgencia() {
        SessaoBancaria.getInstance().setCodigoAgencia("123456");
        assertEquals("123456", SessaoBancaria.getInstance().getCodigoAgencia());
    }

    @Test
    public void deveRetornarMoedaBase() {
        SessaoBancaria.getInstance().setMoedaBase("BRL");
        assertEquals("BRL", SessaoBancaria.getInstance().getMoedaBase());
    }

}