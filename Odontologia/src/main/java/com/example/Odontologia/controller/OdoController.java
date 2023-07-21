
package com.example.Odontologia.controller;

import com.example.Odontologia.Pasiente;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OdoController {
    
    @GetMapping("/pasientes/todos")
    @ResponseBody
    public List<Pasiente> traerPasiente (){
        
        List <Pasiente> listaPasientes = new ArrayList<Pasiente>();
        
        listaPasientes.add(new Pasiente(1, 34124918, "Elio", "Bareiro", LocalDate.of(1988, 9, 12)));
        listaPasientes.add(new Pasiente(2, 33525547, "Maria", "Valenciana", LocalDate.of(1975, 6, 3)));
        listaPasientes.add(new Pasiente(3, 32546845, "Julia", "Strigan", LocalDate.of(2003, 8, 19)));
        listaPasientes.add(new Pasiente(4, 24589654, "Foo", "Fighters", LocalDate.of(2013, 8, 25)));
        
        return listaPasientes;
    }
    
    @GetMapping("/pasientes/menores")
    @ResponseBody
    public List<Pasiente> traerMenores (){
        
        List <Pasiente> listaPasientes = new ArrayList<Pasiente>();
        listaPasientes.add(new Pasiente(1, 34124918, "Elio", "Bareiro", LocalDate.of(1988, 9, 12)));
        listaPasientes.add(new Pasiente(2, 33525547, "Maria", "Valenciana", LocalDate.of(1975, 6, 3)));
        listaPasientes.add(new Pasiente(3, 32546845, "Julia", "Strigan", LocalDate.of(2003, 8, 19)));
        listaPasientes.add(new Pasiente(4, 24589654, "Foo", "Fighters", LocalDate.of(2013, 8, 25)));
        
        List <Pasiente> listaMenores = new ArrayList<Pasiente>();
        
        for (Pasiente pa : listaPasientes) {
            
            LocalDate hoy = LocalDate.now();
            //calculo período entre fecha de nacimiento del paciente y fecha de hoy 
            Period cant_anios = Period.between(pa.getFechaNacimiento(), hoy);
             
            if (cant_anios.getYears()<18) {
                System.out.println("cant anios " + cant_anios.getYears());
                listaMenores.add(pa);
            }
         
         }
         return listaMenores;
        
    }
    
    
    
}
