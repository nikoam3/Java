package Clase17.MesaPG;

import Clase17.Clase.ClienteException;

import java.time.LocalDate;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        try {
            Paciente paciente=new Paciente("Juan","Perez","12345", new Date(122,5,20));
            paciente.darAlta(new Date (122,5,19));
        }catch (PacienteException p){
            System.err.println(p.toString());
        }


    }
}
