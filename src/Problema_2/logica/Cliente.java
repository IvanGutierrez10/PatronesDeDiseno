package Problema_2.logica;

public class Cliente {
    private FormaDePago metodoDePago;
    public Cliente(FormaDePago metodoDePago) {
        this.metodoDePago=metodoDePago;
    }
    public void comprobarMonto(){
        boolean montoValido=true;

        montoValido=this.metodoDePago.comprobarMontoDisponible(3000);
        if(montoValido){
            System.out.println("El metodo de Pago cuenta con fondos suficientes para continuar con la transacción");
            realizarPago();
        }
        else {
            System.out.println("Error: Fondos insuficientes");
        }

    }
    private void realizarPago(){
        this.metodoDePago.realizarPago();
    }

}