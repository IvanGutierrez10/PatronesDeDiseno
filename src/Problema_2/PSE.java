package Problema_2;

public class PSE {
    public int MontoPermitido;

    public PSE(int montoPermitido) {
        this.MontoPermitido = montoPermitido;
    }

    public int getMontoPermitido() {
        return this.MontoPermitido;
    }

    public void descontarDinero(int montoAPagar){
        this.MontoPermitido = MontoPermitido-montoAPagar;
        System.out.println("Pago realizado con exito mediante PSE");
    }

}
