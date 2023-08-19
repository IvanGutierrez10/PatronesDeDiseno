package Problema_2.modeloNegocio;

import Problema_2.logica.FormaDePago;

public class AdaptadorPSE implements FormaDePago {
    private PSE nuevoSistemaPse;
    private int montoAPagar;

    public AdaptadorPSE(PSE nuevoSistemaPse) {
        this.nuevoSistemaPse = nuevoSistemaPse;
    }

    @Override
    public boolean comprobarMontoDisponible(int montoAPagar) {
        this.montoAPagar=montoAPagar;
        int montoPermitido;

        montoPermitido= nuevoSistemaPse.getMontoPermitido();
        if(montoAPagar<montoPermitido){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void realizarPago() {
        nuevoSistemaPse.descontarDinero(this.montoAPagar);
    }
}
