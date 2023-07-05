package paquete004;

import paquete001.Persona;
import paquete003.BilleteraPagos;

public class PagoLuzElectrica extends Pagos {

    private double tarifaBase;
    private double kilovatiosConsumidos;
    private double costoKilovatio;
    private String ciudad;

    public PagoLuzElectrica(String ciudad, double tarifaBase, double kilovatiosConsumidos,
            double costoKilovatio) {
        this.ciudad = ciudad;
        this.tarifaBase = tarifaBase;
        this.kilovatiosConsumidos = kilovatiosConsumidos;
        this.costoKilovatio = costoKilovatio;
    }

    public void establecerCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    

    public void establecerTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public void establecerKilovatiosConsumidos(double kilovatiosConsumidos) {
        this.kilovatiosConsumidos = kilovatiosConsumidos;
    }

    public void establecerCostoKilovatio(double costoKilovatio) {
        this.costoKilovatio = costoKilovatio;
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }

    public double obtenerKilovatiosConsumidos() {
        return kilovatiosConsumidos;
    }

    public double obtenerCostoKilovatio() {
        return costoKilovatio;
    }

    public String obtenerCiudad() {
        return ciudad;
    }
    

    @Override
    public double calcularPago() {

        if (ciudad.equals("Loja")) {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio / 2);
        } else {
            pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio);
        }

        return pago;
    }

    @Override
    public String toString() {
        String cadena = "Pago Telefono Convencional";
        cadena = String.format(""
                + "%s\n"
                + "Ciudad: %s\n"
                + "Tariga Base: %.2f\n"
                + "kilovatios Consumidos: %.2f\n"
                + "Costo Kilovatio: %.2f\n"
                + "%s\n",
                cadena,
                obtenerCiudad(),
                obtenerTarifaBase(),
                obtenerKilovatiosConsumidos(),
                obtenerCostoKilovatio(),
                super.toString());
        return cadena;
    }
}
