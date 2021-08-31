package Vista;

import Controlador.Control;

public interface InterfazNumeros {

    void setControlador(Control c);

    void inicializar();

    void visualizar();

    void esconder();

    static final String BILLETE_UNO = "1$";
    static final String BILLETE_CINCO = "5$";
    static final String BILLETE_DIEZ = "10$";
    static final String BILLETE_VEINTE = "20$";
    static final String BILLETE_CINCUENTA = "50$";
    static final String BILLETE_CIEN = "100$";

    static final String MONEDA_UNO = "1c";
    static final String MONEDA_CINCO = "5c";
    static final String MONEDA_DIEZ = "10c";
    static final String MONEDA_VEINTICINCO = "25c";
    static final String MONEDA_CINCUENTA = "50c";
    static final String MONEDA_CIEN = "1D";
    
    static final String MOSTRAR = "Mostrar Cantidad";

}
