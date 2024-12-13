package org.example;

public class Estudiante extends ComunidadEpn {
    int codigo;
    String periodoacademico;
    String club;
    String aso;

    public Estudiante(String cedula, String nombrecompleto, int edad, String direccion, String telefono, String correo, int codigo, String periodoacademico, String club, String aso) {
        super(cedula, nombrecompleto, edad, direccion, telefono, correo);
        this.codigo = codigo;
        this.periodoacademico = periodoacademico;
        this.club = club;
        this.aso = aso;
    }

    public Estudiante() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPeriodoacademico() {
        return periodoacademico;
    }

    public void setPeriodoacademico(String periodoacademico) {
        this.periodoacademico = periodoacademico;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getAso() {
        return aso;
    }

    public void setAso(String aso) {
        this.aso = aso;
    }
@Override
public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Codigo: "+this.codigo);
       // System.out.println("Codigo: "+this.getCodigo());
        System.out.println("Periodo academico: "+this.periodoacademico);
        System.out.println("Club: "+this.club);
        System.out.println("Aso: "+this.aso);
}
}
