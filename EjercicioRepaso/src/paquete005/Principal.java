package paquete005;

import java.util.ArrayList;
import paquete003.BilleteraPagos;
import paquete001.*;
import paquete002.*;
import paquete004.*;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Pagos> lista = new ArrayList<>();

        Ciudad ciudad = new Ciudad("Loja");
        Persona persona = new Persona("Juan", "Ramirez", 20,
                "SR12", ciudad);
//        lista.add(persona);
        Propiedad propiedad = new Propiedad(1000000);
//        lista.add(propiedad);

        PagoAguaPotable aguaCasa = new PagoAguaPotable("Comercial",
                12, 112, 100);
        aguaCasa.calcularPago();
        lista.add(aguaCasa);
        PagoAguaPotable aguaComercio = new PagoAguaPotable("Publico",
                14, 102, 30);
        aguaComercio.calcularPago();
        lista.add(aguaComercio);

        PagoLuzElectrica luzCasa = new PagoLuzElectrica("Quito",
                100, 122, 100);
        luzCasa.calcularPago();
        lista.add(luzCasa);
        PagoLuzElectrica luzComercio = new PagoLuzElectrica("Loja",
                20, 60, 50);
        luzComercio.calcularPago();
        lista.add(luzComercio);

        PagoPredial casa1 = new PagoPredial(propiedad, 12);
        casa1.calcularPago();
        lista.add(casa1);
        PagoPredial casa2 = new PagoPredial(propiedad, 15);
        casa2.calcularPago();
        lista.add(casa2);

        PagoTelefonoConvencional telefonoCasa = new PagoTelefonoConvencional(
                123, 100, 0.50);
        telefonoCasa.calcularPago();
        lista.add(telefonoCasa);
        PagoTelefonoConvencional telefonoFinca = new PagoTelefonoConvencional(
                143, 140, 0.20);
        telefonoFinca.calcularPago();
        lista.add(telefonoFinca);

        BilleteraPagos pago = new BilleteraPagos(lista);

//        System.out.println(pago);
    }
}
