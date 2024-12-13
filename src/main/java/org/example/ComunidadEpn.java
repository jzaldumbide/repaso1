package org.example;

public class ComunidadEpn {
    String cedula;
    String nombrecompleto;
    int edad;
    String direccion;
    String telefono;
    String correo;

    public ComunidadEpn() {
    }

    public ComunidadEpn(String cedula, String nombrecompleto, int edad, String direccion, String telefono, String correo) {
        this.cedula = cedula;
        this.nombrecompleto = nombrecompleto;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void mostrarDatos(){
        System.out.println("Cedula: "+this.cedula);
        System.out.println("Nombre completo: "+this.nombrecompleto);
        System.out.println("Edad: "+this.edad);
        System.out.println("Direccion: "+this.direccion);
        System.out.println("Telefono: "+this.telefono);
        System.out.println("Correo: "+this.correo);
    }

    public String mostrarDatos2(){
        String resultado= "Cedula: "+this.cedula
                +"Nombre completo: "+this.nombrecompleto
                +"Edad: "+this.edad
                +"Direccion: "+this.direccion
                +"Telefono: "+this.telefono
                +"Correo: "+this.correo;
        return resultado;
    }
}
