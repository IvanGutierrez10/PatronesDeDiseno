package Problema_1.logica;

public class Cliente {
    private OrderProcessingTemplate nuevaOrden;

    public Cliente(OrderProcessingTemplate nuevaOrden) {
        this.nuevaOrden = nuevaOrden;
    }

    public void procesarOrden(){
        nuevaOrden.processOrder();
    }
}
