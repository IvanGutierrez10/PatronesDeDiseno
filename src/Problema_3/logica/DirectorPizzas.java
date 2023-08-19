package Problema_3.logica;

import Problema_3.modeloNegocio.Pizza;

import java.util.List;

public class DirectorPizzas {
    private ConstructorPizza constructorPizza;

    public DirectorPizzas(ConstructorPizza constructorPizza) {
        this.constructorPizza = constructorPizza;
    }

    public Pizza buildOrden(String tamano, String tipoDeMasa, List<String> ingredientes, boolean bordeExtraQueso){
        this.constructorPizza.buildTamano(tamano);
        this.constructorPizza.buildTipoDeMasa(tipoDeMasa);
        this.constructorPizza.buildIngredientes(ingredientes);
        this.constructorPizza.buildBordeExtraQueso(bordeExtraQueso);

        return this.constructorPizza.buildPizza();
    }
}
