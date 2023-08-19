package Problema_3.logica;

import Problema_3.modeloNegocio.ConstructorPizzaPersonalizada;
import Problema_3.modeloNegocio.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private ConstructorPizzaPersonalizada buildPizzaPersonalizada;

    public Cliente(ConstructorPizzaPersonalizada buildPizzaPersonalizada) {
        this.buildPizzaPersonalizada = buildPizzaPersonalizada;
    }

    public void crearPizza(){
        DirectorPizzas directorPizzas = new DirectorPizzas(buildPizzaPersonalizada);

        List<String> ingredientes = new ArrayList<>();
        ingredientes.add("Jamon");
        ingredientes.add("Peperoni");

        Pizza pizza = directorPizzas.buildOrden("Mediano", "Delgada", ingredientes, true);
        pizza.mostrarPizza();
    }
}




