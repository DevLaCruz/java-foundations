package oop_packages.example.hogar;

import oop_packages.example.jardin.Perro;

import static oop_packages.example.hogar.Persona.saludar;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();
        Perro perro = new Perro();
        String saludo = saludar();
    }
}
