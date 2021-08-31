package Vista;

import Controlador.Control;
import Modelo.Billete;
import Modelo.Moneda;
import java.math.BigDecimal;
import java.util.ArrayList;

public interface InterfazTotal {
   
    void setControlador(Control c);
    void inicializar();
    void visualizar();
    void esconder();
    
    void mostrar(ArrayList<Billete> billetes, ArrayList<Moneda> monedas, BigDecimal suma);
    
    static final String ATRAS="Atras";
    
}
