package Modelo;

import java.math.BigDecimal;

public class Moneda {

    private BigDecimal valor;

    public Moneda(BigDecimal valor) {
        this.valor = valor;
    }

    public Moneda() {
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
