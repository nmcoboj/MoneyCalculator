package Modelo;

import java.math.BigDecimal;


public class Billete {
    
    private BigDecimal valor;

    public Billete(BigDecimal valor) {
        this.valor = valor;
    }

    public Billete() {
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }


}
