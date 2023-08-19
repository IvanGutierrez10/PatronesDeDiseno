package Problema_3.modeloNegocio;

import Problema_3.logica.ConstructorPizza;
import java.util.List;

public class ConstructorPizzaPersonalizada implements ConstructorPizza {
    private Pizza pizza;

    public ConstructorPizzaPersonalizada(){
        this.pizza = new Pizza();
    }

    @Override
    public void buildTamano(String tamano) {
        this.pizza.setTamano(tamano);
    }

    @Override
    public void buildTipoDeMasa(String tipoDeMasa) {
        this.pizza.setTipoDeMasa(tipoDeMasa);
    }

    @Override
    public void buildIngredientes(List<String> ingredientes) {
        for(String ingrediente : ingredientes){
            this.pizza.addIngredientes(ingrediente);
        }
    }

    @Override
    public void buildBordeExtraQueso(boolean bordeExtraQueso) {
        this.pizza.setBordeExtraQueso(bordeExtraQueso);
    }

    @Override
    public Pizza buildPizza() {
        return this.pizza;
    }
}
