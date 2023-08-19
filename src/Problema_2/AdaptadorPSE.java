package Problema_2;

public class AdaptadorPSE implements FormaDePago{
    private PSE nuevosistema;
    private int montoAPagar;

    public AdaptadorPSE(PSE nuevosistema) {
        this.nuevosistema = nuevosistema;
    }

    @Override
    public boolean comprobarMontoDisponible(int montoAPagar) {
        this.montoAPagar=montoAPagar;
        int montoPermitido;

        montoPermitido=nuevosistema.getMontoPermitido();
        if(montoAPagar<montoPermitido){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void realizarPago() {
        nuevosistema.descontarDinero(this.montoAPagar);
    }
}
