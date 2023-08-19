package Problema_3.logica;

import Problema_3.modeloNegocio.Pizza;

import java.util.List;

public interface ConstructorPizza {
    void buildTamano(String tamano);
    void buildTipoDeMasa(String tipoDeMasa);
    void buildIngredientes(List<String> ingredientes);
    void buildBordeExtraQueso(boolean bordeExtraQueso);
    Pizza buildPizza();
}
