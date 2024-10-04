package com.mesc.MyMedicalAppointments;

public class Doctor {
    int id;
    String nombre;
    String especialidad;

    Doctor(){
        //System.out.println("consruyendo el objeto");
        //id++;
    }
    Doctor(String nombre, String especialidad){
        this.nombre=nombre;
        this.especialidad=especialidad;
        System.out.println("el nombre es"+nombre);
        id++;
    }

    public void showName(){
        System.out.println(nombre);
    }
    public void showId(){
        System.out.println(id);
    }
}
