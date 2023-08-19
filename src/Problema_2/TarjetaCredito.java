package Problema_2;

public class TarjetaCredito implements FormaDePago{
    @Override
    public boolean comprobarMontoDisponible(int montoAPagar) {
        if(20000<montoAPagar){
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
