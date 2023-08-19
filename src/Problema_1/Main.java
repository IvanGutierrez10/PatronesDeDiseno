package Problema_1;

public class Main {
    public static void main(String[] args) {

        OrderProcessingTemplate electronicsOrder = new ElectronicsOrder();
        electronicsOrder.processOrder();

        System.out.println("--------------------------");


        OrderProcessingTemplate clothingOrder = new ClothingOrder();
        clothingOrder.processOrder();

        System.out.println("--------------------------");


        OrderProcessingTemplate foodOrder = new FoodOrder();
        foodOrder.processOrder();

    }
}
