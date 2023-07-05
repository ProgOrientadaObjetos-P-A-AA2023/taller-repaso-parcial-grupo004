package paquete004;

import paquete001.Persona;

public abstract class Pagos {

    protected Persona persona;
    protected double pago;


    public void establecerPersona(Persona persona) {
        this.persona = persona;
    }

    public void obtenerPago(double pago) {
        this.pago = pago;
    }

    public Persona obtenerPersona() {
        return persona;
    }

    public double obtenerPago() {
        return pago;
    }

    public abstract double calcularPago();

    @Override
    public String toString() {
        String cadena = String.format("Pago: %.2f\n", obtenerPago());
        return cadena;
    }
}
