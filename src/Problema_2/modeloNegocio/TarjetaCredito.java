package Problema_2.modeloNegocio;

import Problema_2.logica.FormaDePago;

public class TarjetaCredito implements FormaDePago {
    private int montoDisponible;

    public TarjetaCredito(int montoDisponible) {
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
        System.out.println("Pago realizado con exito mediante Tarejeta de Pago");
    }
}
