package com.example.ejerciciofactory;

public class Docente extends Persona implements IPersona{
    public Docente() {
    }

    public Docente(Integer id, String nombre, String cargo, Double salario) {
        super(id, nombre, cargo, salario);
    }

    public Docente(String nombre, String cargo, Double salario) {
        super(nombre, cargo, salario);
    }

    @Override
    public void aumentarSueldo() {
        System.out.println("Es persona escencial, tiene un incremento del 70% de su salario");

    }
}
