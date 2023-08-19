package Problema_2.modeloNegocio;

import Problema_2.logica.FormaDePago;

public class Paypal implements FormaDePago {
    private int montoDisponible;

    public Paypal(int montoDisponible) {
        this.montoDisponible = montoDisponible;
    }

    @Override
    public boolean comprobarMontoDisponible(int montoAPagar) {
        if(montoDisponible>montoAPagar){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void realizarPago() {
        System.out.println("Pago realizado con exito mediante Paypal");
    }
}
