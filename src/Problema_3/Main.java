package Problema_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConstructorPizzaPersonalizada constructorPizzaPersonalizada = new ConstructorPizzaPersonalizada();
        Director pizzaDirector = new Director(constructorPizzaPersonalizada);

        List<String> ingredientes = new ArrayList<>();
        ingredientes.add("Jamon");
        ingredientes.add("Peperoni");

        Pizza pizza = pizzaDirector.construirOrden("Mediano", "Delgada", ingredientes, true);
        pizza.mostrarPizza();
    }
}
