package Problema_1.logica;

public abstract class OrderProcessingTemplate {
    public final void processOrder() {
        verifyInventory();
        calculateTotal();
        applyDiscount();
        additionalProcessing();
        generateInvoice();
        notifyCustomer();
    }

    protected abstract void verifyInventory();
    protected abstract void calculateTotal();
    protected abstract void applyDiscount();
    protected abstract void additionalProcessing();
    protected abstract void generateInvoice();
    protected abstract void notifyCustomer();

}
