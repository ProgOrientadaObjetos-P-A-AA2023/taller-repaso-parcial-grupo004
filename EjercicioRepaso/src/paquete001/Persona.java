package paquete001;

import paquete002.Ciudad;

public class Persona {

    String nombre;
    String apellido;
    int edad;
    String cedula;
    public Ciudad ciudad;

    public Persona(String nombre, String apellido, int edad, String cedula, 
            Ciudad ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.ciudad = ciudad;
    }

    
    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerApellido(String apellido) {
        this.apellido = apellido;
    }

    public void establecerEdad(int edad) {
        this.edad = edad;
    }

    public void establecerCedula(String cedula) {
        this.cedula = cedula;
    }

    public void establecerCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public int obtenerEdad() {
        return edad;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        String cadena = String.format(""
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Edad: %s\n"
                + "Cedula: %s\n"
                + "Ciudad: %s\n",
                obtenerNombre(),
                obtenerApellido(),
                obtenerEdad(),
                obtenerCedula(),
                obtenerCiudad());
        return cadena;
    }
}
