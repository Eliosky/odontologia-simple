
package com.example.Odontologia;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Pasiente {
    
    private int id;
    private int dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    public Pasiente() {
    }

    public Pasiente(int id, int dni, String nombre, String apellido, LocalDate fechaNacimiento) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
}
