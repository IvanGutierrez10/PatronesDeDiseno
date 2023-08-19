package Problema_2.logica;

public interface FormaDePago {
    boolean comprobarMontoDisponible(int montoAPagar);
    void realizarPago();
}
