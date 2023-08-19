package Problema_2;

public class Paypal implements FormaDePago{
    @Override
    public boolean comprobarMontoDisponible(int montoAPagar) {
        if(100000<montoAPagar){
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
