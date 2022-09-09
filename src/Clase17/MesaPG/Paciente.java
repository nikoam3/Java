package Clase17.MesaPG;

import Clase17.Clase.ClienteException;

import java.util.Date;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    Date fechaInternacion;
    Date fechaAlta;


    Paciente(String nombre , String apellido , String historiaClinica , Date fechaInternacion) throws PacienteException {
        Date hoy = new Date();
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaAlta = null;
        if (fechaInternacion.after(hoy))
            throw new PacienteException("La feche ingresada no es correcta");
        this.fechaInternacion = fechaInternacion;
    }

            public Date getFechaInternacion() {
                return fechaInternacion;
            }

            public Date getFechaAlta() {
                return fechaAlta;
            }

    public void darAlta(Date fechaAlta) throws PacienteException {
        if (fechaAlta.before(fechaInternacion))
            throw new PacienteException("Fecha de alta no puede ser anterior a la fecha de internacion");
        this.fechaAlta = fechaAlta;
    }
}



