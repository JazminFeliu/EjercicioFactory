package com.example.ejerciciofactory;

public class Jefe extends Persona implements IPersona{

    public Jefe() {
    }

    public Jefe(Integer id, String nombre, String cargo, Double salario) {
        super(id, nombre, cargo, salario);
    }

    public Jefe(String nombre, String cargo, Double salario) {
        super(nombre, cargo, salario);
    }

    @Override
    public void aumentarSueldo() {
        System.out.println("La paritaria arrojo un 35% de aumento salarial");

    }
}
