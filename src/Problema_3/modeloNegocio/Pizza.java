package Problema_3.modeloNegocio;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String tamano;
    private String tipoDeMasa;
    private List<String> ingredientes;
    private boolean bordeExtraQueso;

    public Pizza(){
        ingredientes = new ArrayList<>();
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public void setTipoDeMasa(String tipoDeMasa) {
        this.tipoDeMasa = tipoDeMasa;
    }

    public void addIngredientes(String ingrediente){
        ingredientes.add(ingrediente);
    }

    public void setBordeExtraQueso(boolean bordeExtraQueso) {
        this.bordeExtraQueso = bordeExtraQueso;
    }

    public int calcularCosto(){
        int costo = 0;

        if (("Pequeño").equals(tamano)) {
            costo += 10000;
        } else if (("Mediano").equals(tamano)) {
            costo += 15000;
        } else if (("Grande").equals(tamano)) {
            costo += 20000;
        }

        costo += ingredientes.size() * 4000;

        if (bordeExtraQueso) {
            costo += 6000;
        }

        return costo;
    }

    public void mostrarPizza(){
        System.out.println("Pizza personalizada:");
        System.out.println("Tamaño: " + tamano);
        System.out.println("Masa: " + tipoDeMasa);
        System.out.println("Ingredientes: " + ingredientes);
        if (bordeExtraQueso) {
            System.out.println("Cobertura extra de queso");
        }
        System.out.println("Costo total: $" + calcularCosto());
    }
}