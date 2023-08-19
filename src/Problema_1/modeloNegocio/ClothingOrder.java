package Problema_1.modeloNegocio;

import Problema_1.logica.OrderProcessingTemplate;

public class ClothingOrder extends OrderProcessingTemplate {
    @Override
    protected void verifyInventory() {
        System.out.println("Verificando inventario");
    }

    @Override
    protected void calculateTotal() {
        System.out.println("Calculando total");
    }

    @Override
    protected void applyDiscount() {
        System.out.println("Aplicando Descuento");
    }

    @Override
    protected void additionalProcessing() {
        System.out.println("Procedimiento Adicional de ropa");
    }

    @Override
    protected void generateInvoice() {
        System.out.println("Generando Factura");
    }

    @Override
    protected void notifyCustomer() {
        System.out.println("Notificando cliente");
    }
}