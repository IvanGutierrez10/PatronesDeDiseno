package Problema_2;

public class Main {
    public static void main(String[] args) {
        FormaDePago Paypal = new Paypal();
        PSE pse = new PSE(10000);
        FormaDePago PSE = new AdaptadorPSE(pse);
        FormaDePago tarjetaCredito = new TarjetaCredito();

        Paypal.realizarPago();
        PSE.realizarPago();
        tarjetaCredito.realizarPago();
    }
}
