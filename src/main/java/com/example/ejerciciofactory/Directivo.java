package com.example.ejerciciofactory;

public class Directivo extends Persona implements IPersona {

    public Directivo() {
    }

    public Directivo(Integer id, String nombre, String cargo, Double salario) {
        super(id, nombre, cargo, salario);
    }

    public Directivo(String nombre, String cargo, Double salario) {
        super(nombre, cargo, salario);
    }

    @Override
    public void aumentarSueldo() {
        System.out.println("Feliitaciones, tiene un incremento del 22% este mes ");

    }
}
