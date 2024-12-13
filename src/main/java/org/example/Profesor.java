package org.example;

public class Profesor extends ComunidadEpn{
    String materiasdictadas;
    String facultad;
    String tipocontrato;

    public Profesor(String cedula, String nombrecompleto, int edad, String direccion, String telefono, String correo, String materiasdictadas, String tipocontrato, String facultad) {
        super(cedula, nombrecompleto, edad, direccion, telefono, correo);
        this.materiasdictadas = materiasdictadas;
        this.tipocontrato = tipocontrato;
        this.facultad = facultad;
    }

    public Profesor() {
    }

    public String getMateriasdictadas() {
        return materiasdictadas;
    }

    public void setMateriasdictadas(String materiasdictadas) {
        this.materiasdictadas = materiasdictadas;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getTipocontrato() {
        return tipocontrato;
    }

    public void setTipocontrato(String tipocontrato) {
        this.tipocontrato = tipocontrato;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Materias dictadas: "+this.materiasdictadas);
        System.out.println("Tipo de contrato: "+this.tipocontrato);
        System.out.println("Facultad: "+this.facultad);
    }
}
