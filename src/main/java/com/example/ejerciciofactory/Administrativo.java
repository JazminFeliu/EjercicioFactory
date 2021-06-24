package com.example.ejerciciofactory;

public class Administrativo extends Persona implements IPersona{

    public Administrativo() {
    }

    public Administrativo(Integer id, String nombre, String cargo, Double salario) {
        super(id, nombre, cargo, salario);
    }

    public Administrativo(String nombre, String cargo, Double salario) {
        super(nombre, cargo, salario);
    }

    @Override
    public void aumentarSueldo() {
        System.out.println("Por el buen desempeño, un 50% aumento de sueldo, felicitaciones");

    }
}
