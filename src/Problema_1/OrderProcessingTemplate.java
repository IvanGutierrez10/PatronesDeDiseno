package Problema_1;

public abstract class OrderProcessingTemplate {
    public final void processOrder() {
        verifyInventory();
        calculateTotal();
        applyDiscount();
        additionalProcessing();
        generateInvoice();
        notifyCustomer();
    }

    abstract void verifyInventory();
    abstract void calculateTotal();
    abstract void applyDiscount();
    abstract void additionalProcessing();
    abstract void generateInvoice();
    abstract void notifyCustomer();

}
