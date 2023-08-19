package Problema_2;

public interface FormaDePago {
    boolean comprobarMontoDisponible(int montoAPagar);
    void realizarPago();
}
