package Problema_3;

import java.util.List;

public class Director {
    private ConstructorPizza constructorPizza;

    public Director(ConstructorPizza constructorPizza) {
        this.constructorPizza = constructorPizza;
    }

    public Pizza construirOrden(String tamano, String tipoDeMasa, List<String> ingredientes, boolean bordeExtraQueso){
        this.constructorPizza.addTamano(tamano);
        this.constructorPizza.addTipoDeMasa(tipoDeMasa);
        this.constructorPizza.addIngredientes(ingredientes);
        this.constructorPizza.addBordeExtraQueso(bordeExtraQueso);

        return this.constructorPizza.armarPizza();
    }
}
