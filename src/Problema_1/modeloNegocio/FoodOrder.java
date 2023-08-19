package Problema_1.modeloNegocio;

import Problema_1.logica.OrderProcessingTemplate;

public class FoodOrder extends OrderProcessingTemplate {
    @Override
    public void verifyInventory() {
        System.out.println("Verificando comida del inventario");
    }

    @Override
    public void calculateTotal() {
        System.out.println("Calculando costo de la comida");
    }

    @Override
    public void applyDiscount() {
        System.out.println("Aplicando descuento de la comida");
    }

    @Override
    public void additionalProcessing() {
        System.out.println("Procedimiento Adicional de comida");;
    }

    @Override
    public void generateInvoice() {
        System.out.println("Generando factura de alimentos");
    }

    @Override
    public void notifyCustomer() {
        System.out.println("Notificando al cliente");
    }
}