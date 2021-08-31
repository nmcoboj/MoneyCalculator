package Controlador;

import Modelo.Billete;
import Modelo.Moneda;
import Vista.InterfazNumeros;
import Vista.InterfazTotal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Control implements ActionListener{

    private InterfazNumeros INumeros;
    private InterfazTotal IMostrar;
    private Billete billete;
    private Moneda moneda;

    public Control(InterfazNumeros INumeros, InterfazTotal IMostrar, Billete billete, Moneda moneda) {
        this.INumeros = INumeros;
        this.IMostrar = IMostrar;
        this.billete = billete;
        this.moneda = moneda;
    }

    private ArrayList<Billete> billetes = new ArrayList<>();
    private ArrayList<Moneda> monedas = new ArrayList<>();
    BigDecimal suma=new BigDecimal("0");

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getActionCommand().equals(InterfazNumeros.BILLETE_UNO)) {
            BigDecimal a=new BigDecimal("1");
            billetes.add(new Billete(a));
            suma = suma.add(a);
        }
        if (evento.getActionCommand().equals(InterfazNumeros.BILLETE_CINCO)) {
            BigDecimal a=new BigDecimal("5");
            billetes.add(new Billete(a));
            suma = suma.add(a);
        }
        if (evento.getActionCommand().equals(InterfazNumeros.BILLETE_DIEZ)) {
            BigDecimal a=new BigDecimal("10");
            billetes.add(new Billete(a));
            suma = suma.add(a);
        }
        if (evento.getActionCommand().equals(InterfazNumeros.BILLETE_VEINTE)) {
            BigDecimal a=new BigDecimal("20");
            billetes.add(new Billete(a));
            suma = suma.add(a);
        }
        if (evento.getActionCommand().equals(InterfazNumeros.BILLETE_CINCUENTA)) {
            BigDecimal a=new BigDecimal("50");
            billetes.add(new Billete(a));
            suma = suma.add(a);
        }
        if (evento.getActionCommand().equals(InterfazNumeros.BILLETE_CIEN)) {
            BigDecimal a=new BigDecimal("100");
            billetes.add(new Billete(a));
            suma = suma.add(a);
        }
        if (evento.getActionCommand().equals(InterfazNumeros.MONEDA_UNO)) {
            BigDecimal a=new BigDecimal("0.01");
            monedas.add(new Moneda(a));
            suma = suma.add(a);

        }
        if (evento.getActionCommand().equals(InterfazNumeros.MONEDA_CINCO)) {
            BigDecimal a=new BigDecimal("0.05");
            monedas.add(new Moneda(a));
            suma = suma.add(a);
        }
        if (evento.getActionCommand().equals(InterfazNumeros.MONEDA_DIEZ)) {
            BigDecimal a=new BigDecimal("0.10");
            monedas.add(new Moneda(a));
            suma = suma.add(a);
        }
        if (evento.getActionCommand().equals(InterfazNumeros.MONEDA_VEINTICINCO)) {
            BigDecimal a=new BigDecimal("0.25");
            monedas.add(new Moneda(a));
            suma = suma.add(a);
        }
        if (evento.getActionCommand().equals(InterfazNumeros.MONEDA_CINCUENTA)) {
            BigDecimal a=new BigDecimal("0.5");
            monedas.add(new Moneda(a));
            suma = suma.add(a);
        }
        if (evento.getActionCommand().equals(InterfazNumeros.MONEDA_CIEN)) {
            BigDecimal a=new BigDecimal("1");
            monedas.add(new Moneda(a));
            suma = suma.add(a);
        }

        if (evento.getActionCommand().equals(InterfazNumeros.MOSTRAR)) {
            INumeros.esconder();
            IMostrar.mostrar(billetes, monedas, suma);
            IMostrar.visualizar();
        }

        if (evento.getActionCommand().equals(InterfazTotal.ATRAS)) {
            IMostrar.esconder();
            suma=new BigDecimal("0");
            billetes.removeAll(billetes);
            monedas.removeAll(monedas);
            INumeros.visualizar();
        }

    }

}
