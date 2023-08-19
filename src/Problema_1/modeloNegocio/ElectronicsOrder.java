package Problema_1.modeloNegocio;

import Problema_1.logica.OrderProcessingTemplate;

public class ElectronicsOrder extends OrderProcessingTemplate {
    @Override
    protected void verifyInventory() {
        System.out.println("Verificando inventario");
    }

    @Override
    protected void calculateTotal() {
        System.out.println("Calculando total de electronico");
    }

    @Override
    protected void applyDiscount() {
        System.out.println("Aplicando Descuento de electronicos");
    }

    @Override
    protected void additionalProcessing() {
        System.out.println("Procedimiento Adicional de electronicos");
    }

    @Override
    protected void generateInvoice() {
        System.out.println("Generando Factura.");
    }

    @Override
    protected void notifyCustomer() {
        System.out.println("Notificando cliente de dispositivo electronico");
    }
}
