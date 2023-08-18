package Problema_3;

import java.util.List;

public class ConstructorPizzaPersonalizada implements ConstructorPizza{
    private Pizza pizza;

    public ConstructorPizzaPersonalizada(){
        this.pizza = new Pizza();
    }

    @Override
    public void addTamano(String tamano) {
        this.pizza.setTamano(tamano);
    }

    @Override
    public void addTipoDeMasa(String tipoDeMasa) {
        this.pizza.setTipoDeMasa(tipoDeMasa);
    }

    @Override
    public void addIngredientes(List<String> ingredientes) {
        for(String ingrediente : ingredientes){
            this.pizza.addIngredientes(ingrediente);
        }
    }

    @Override
    public void addBordeExtraQueso(boolean bordeExtraQueso) {
        this.pizza.setBordeExtraQueso(bordeExtraQueso);
    }

    @Override
    public Pizza armarPizza() {
        return this.pizza;
    }
}
