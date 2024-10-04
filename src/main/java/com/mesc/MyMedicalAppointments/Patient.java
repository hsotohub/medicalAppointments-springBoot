package com.mesc.MyMedicalAppointments;

public class Patient {
    private String nombre;
    private String direccion;
    private String numero;
    private String cumpleanios;
    private Double peso;
    private Double altura;
    private String sangre;

    Patient(String name, String email){
        this.nombre = name;
        this.direccion = email;
        this.peso = 54.5;
    }
    public String getweight() {
        return this.peso + " kg";
    }

}
