package Problema_2.main;

import Problema_2.logica.Cliente;
import Problema_2.modeloNegocio.AdaptadorPSE;
import Problema_2.modeloNegocio.PSE;

public class Main {
    public static void main(String[] args) {
        Cliente nuevoCliente = new Cliente(new AdaptadorPSE(new PSE(5000)));
        nuevoCliente.comprobarMonto();
    }
}
