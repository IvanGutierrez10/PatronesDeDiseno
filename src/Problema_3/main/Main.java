package Problema_3.main;

import Problema_3.logica.Cliente;
import Problema_3.logica.ConstructorPizza;
import Problema_3.modeloNegocio.ConstructorPizzaPersonalizada;
import Problema_3.logica.DirectorPizzas;

public class Main {
    public static void main(String[] args) {
        Cliente nuevoCliente = new Cliente(new ConstructorPizzaPersonalizada());
        nuevoCliente.crearPizza();
    }
}
