package Problema_3;

import java.util.List;

public interface ConstructorPizza {
    void addTamano(String tamano);
    void addTipoDeMasa(String tipoDeMasa);
    void addIngredientes(List<String> ingredientes);
    void addBordeExtraQueso(boolean bordeExtraQueso);
    Pizza armarPizza();
}
