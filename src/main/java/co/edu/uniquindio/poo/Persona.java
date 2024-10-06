package co.edu.uniquindio.poo;

public abstract class Persona {

    private String nombre;
    private String apellido;
    private int telefono;
    private int edad;
    private int cedula;

    public Persona(String nombre, String apellido, int telefono, int edad, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "[nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", edad=" + edad
                + ", cedula=" + cedula + "]";
    }

}
