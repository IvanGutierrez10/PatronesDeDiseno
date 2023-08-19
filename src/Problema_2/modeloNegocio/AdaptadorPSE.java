package Problema_2.modeloNegocio;

import Problema_2.logica.FormaDePago;

public class AdaptadorPSE implements FormaDePago {
    private PSE nuevosistemaPse;
    private int montoAPagar;

    public AdaptadorPSE(PSE nuevosistemaPse) {
        this.nuevosistemaPse = nuevosistemaPse;
    }

    @Override
    public boolean comprobarMontoDisponible(int montoAPagar) {
        this.montoAPagar=montoAPagar;
        int montoPermitido;

        montoPermitido=nuevosistemaPse.getMontoPermitido();
        if(montoAPagar<montoPermitido){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void realizarPago() {
        nuevosistemaPse.descontarDinero(this.montoAPagar);
    }
}
