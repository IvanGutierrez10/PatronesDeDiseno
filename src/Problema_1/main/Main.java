package Problema_1.main;

import Problema_1.logica.Cliente;
import Problema_1.modeloNegocio.FoodOrder;

public class Main {
    public static void main(String[] args) {
        Cliente nuevoCliente = new Cliente(new FoodOrder());
        nuevoCliente.procesarOrden();
    }
}
