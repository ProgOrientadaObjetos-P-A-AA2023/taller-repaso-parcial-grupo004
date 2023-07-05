package paquete004;

import paquete001.Persona;

public class PagoAguaPotable extends Pagos {

    private double tarifaFija;
    private double metrosCubicosConsumo;
    private double costoConsumoCubicos;
    private String tipo;

    public PagoAguaPotable(String tipo, double tarifaFija, double metrosCubicosConsumo,
            double costoConsumoCubicos) {
//        super(pago);
        this.tipo = tipo;
        this.tarifaFija = tarifaFija;
        this.metrosCubicosConsumo = metrosCubicosConsumo;
        this.costoConsumoCubicos = costoConsumoCubicos;
    }

    public void establecerTipo(String tipo) {
        this.tipo = tipo;
    }

    public void establecerTarifaFija(double tarifaFija) {
        this.tarifaFija = tarifaFija;
    }

    public void establecerMetrosCubicosConsumo(double metrosCubicosConsumo) {
        this.metrosCubicosConsumo = metrosCubicosConsumo;
    }

    public void establecerCostoConsumoCubicos(double costoConsumoCubicos) {
        this.costoConsumoCubicos = costoConsumoCubicos;
    }

    public double obtenerTarifaFija() {
        return tarifaFija;
    }

    public double obtenerMetrosCubicosConsumo() {
        return metrosCubicosConsumo;
    }

    public double obtenerCostoConsumoCubicos() {
        return costoConsumoCubicos;
    }

    public String obtenerTipo() {
        return tipo;
    }

    @Override
    public double calcularPago() {
        double pago = 0;
        if (tipo.equals("comercial")) {

            pago = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos) + 15;
        } else {

            pago = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos);
        }

        return pago;
    }

    @Override
    public String toString() {
        String cadena = "Pago Telefono Convencional";
        cadena = String.format(""
                + "%s\n"
                + "Tipo: %s\n"
                + "Tariga Fija: %.2f\n"
                + "Metros Cubicos Consumo: %.2f\n"
                + "Costo Consumo Cubicos: %.2f\n"
                + "%s\n",
                cadena,
                obtenerTarifaFija(),
                obtenerMetrosCubicosConsumo(),
                obtenerCostoConsumoCubicos(),
                super.toString());
        return cadena;
    }

}
