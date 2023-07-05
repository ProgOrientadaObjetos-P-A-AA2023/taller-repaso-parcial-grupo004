package paquete004;

import paquete002.Propiedad;

public class PagoPredial extends Pagos {

    private Propiedad propiedad;
    double porcentaje;

    public PagoPredial(Propiedad propiedad,
            double porcentaje) {
        this.propiedad = propiedad;
        this.porcentaje = porcentaje;
    }

    public void establecerPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    public void establecerPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Propiedad obtenerPropiedad() {
        return propiedad;
    }



    public double obtenerPorcentaje() {
        return porcentaje;
    }

    @Override
    public double calcularPago() {

        pago = propiedad.costoPropiedad - ((propiedad.costoPropiedad * porcentaje) / 100);
        return pago;
    }

    @Override
    public String toString() {
        String cadena = "Pago Telefono Convencional";
        cadena = String.format(""
                + "%s\n"
                + "Costo Porpiedad: %.2f\n"
                + "Porcentaje: %.2f\n"
                + "%s\n",
                cadena,
                propiedad.costoPropiedad,
                obtenerPorcentaje(),
                super.toString());
        return cadena;
    }

}
