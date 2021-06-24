package com.example.ejerciciofactory;

public abstract class PersonaFactory {

    public static IPersona getPersona(TipoPersona tipoPersona){
        switch (tipoPersona){
            case ADMINISTRATIVO -> {return new Administrativo();}
            case DIRECTIVO -> {return new Directivo();}
            case DOCENTE -> {return new Docente();}
            case JEFE -> {return new Jefe();}
            default -> {return null;}
        }
    }

    public static IPersona getPersona(TipoPersona tipoPersona, String nombre, String cargo, Double salario){
        IPersona nuevaPersona = switch (tipoPersona){
            case ADMINISTRATIVO -> new Administrativo();
            case DIRECTIVO -> new Directivo();
            case DOCENTE -> new Docente();
            case JEFE -> new Jefe();
            default -> null;
        };
        nuevaPersona.actualizarDatos(nombre, cargo, salario);
        return nuevaPersona;
    }
}
