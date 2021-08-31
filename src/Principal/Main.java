package Principal;

import Controlador.Control;
import Modelo.Billete;
import Modelo.Moneda;
import Vista.InterfazNumeros;
import Vista.InterfazTotal;
import Vista.VentanaNumeros;
import Vista.VentanaTotal;

public class Main {

    public static void main(String args[]) {

        InterfazNumeros INumeros = new VentanaNumeros();
        InterfazTotal IMostrar = new VentanaTotal();

        Billete billete = new Billete();
        Moneda moneda = new Moneda();

        Control control = new Control(INumeros, IMostrar, billete, moneda);

        INumeros.inicializar();
        INumeros.setControlador(control);

        IMostrar.inicializar();
        IMostrar.setControlador(control);

    }

}
