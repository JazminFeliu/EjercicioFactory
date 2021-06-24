package com.example.ejerciciofactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class EjercicioFactoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(EjercicioFactoryApplication.class, args);


        TipoPersona tipoPersona = TipoPersona.ADMINISTRATIVO;
        IPersona personaNueva = PersonaFactory.getPersona(tipoPersona);
        System.out.println("******************************************");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tipo de persona: (0)ADMINISTRATIVO (1)DIRECTIVO (2)DOCENTE (3)JEFE DE DEPARTAMENTO: ");
        TipoPersona tipoPersona1 = tipoPersona.values()[Integer.parseInt(sc.nextLine())];
        String nombre = "Jazmin";
        String cargo = tipoPersona1.name();
        Double salario = 150002.23;
        IPersona nuevaPersona = PersonaFactory.getPersona(tipoPersona1, nombre, cargo, salario);
            }



}
