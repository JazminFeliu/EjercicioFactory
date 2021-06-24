package com.example.ejerciciofactory;

public abstract class Persona implements IPersona{

    protected Integer id;
    protected String nombre;
    protected String cargo;
    protected Double salario;

    @Override
    public void actualizarDatos(String nombre, String cargo, Double salario){
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Persona() {
    }

    public Persona(Integer id, String nombre, String cargo, Double salario) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Persona(String nombre, String cargo, Double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "com.example.ejerciciofactory.Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
