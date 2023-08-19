package Problema_1;

public class FoodOrder extends OrderProcessingTemplate {
    @Override
    protected void verifyInventory() {
        System.out.println("Verificando comida del inventario");
    }

    @Override
    protected void calculateTotal() {
        System.out.println("Calculando costo de la comida");
    }

    @Override
    protected void applyDiscount() {
        System.out.println("Aplicando descuento de la comida");
    }

    @Override
    protected void additionalProcessing() {
        System.out.println("Procedimiento Adicional de comida");;
    }

    @Override
    protected void generateInvoice() {
        System.out.println("Generando factura de alimentos");
    }

    @Override
    protected void notifyCustomer() {
        System.out.println("Notificando al cliente");
    }
}