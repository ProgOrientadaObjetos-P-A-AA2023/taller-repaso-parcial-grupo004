package paquete004;

import paquete001.Persona;
import paquete003.BilleteraPagos;

public class PagoTelefonoConvencional extends Pagos {

    double tarifa;
    double minutosConsumidos;
    double costoMinuto;

    public PagoTelefonoConvencional(double tarifa, double minutosConsumidos,
            double costoMinuto) {
        this.tarifa = tarifa;
        this.minutosConsumidos = minutosConsumidos;
        this.costoMinuto = costoMinuto;
    }

    public void establecerTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void establecerMinutosConsumidos(double minutosConsumidos) {
        this.minutosConsumidos = minutosConsumidos;
    }

    public void establecerCostoMinuto(double costoMinuto) {
        this.costoMinuto = costoMinuto;
    }

    public double obtenerTarifa() {
        return tarifa;
    }

    public double obtenerMinutosConsumidos() {
        return minutosConsumidos;
    }

    public double obtenerCostoMinuto() {
        return costoMinuto;
    }

    @Override
    public double calcularPago() {

        pago = tarifa + (minutosConsumidos * costoMinuto);
        return pago;
    }

    @Override
    public String toString() {
        String cadena = "Pago Telefono Convencional";
        cadena = String.format(""
                + "%s\n"
                + "Tariga: %.2f\n"
                + "Minuto Consumitos: %.2f\n"
                + "Costo Minuto: %.2f\n"
                + "%s\n",
                cadena,
                obtenerTarifa(),
                obtenerMinutosConsumidos(),
                obtenerCostoMinuto(),
                super.toString());
        return cadena;
    }
}
