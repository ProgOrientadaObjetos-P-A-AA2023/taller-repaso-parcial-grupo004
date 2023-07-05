package paquete002;

public class Propiedad {

    public double costoPropiedad;

    public Propiedad(double costoPropiedad) {
        this.costoPropiedad = costoPropiedad;
    }

    
    public void establecerCostoPropiedad(double costoPropiedad) {
        this.costoPropiedad = costoPropiedad;
    }

    public double obtenerCostoPropiedad() {
        return costoPropiedad;
    }
}
