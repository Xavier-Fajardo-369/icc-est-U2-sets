package controllers;

import Models.Contacto;
import Models.utils.ContactoComparador;
import Models.utils.ContactoComparadorHash;
import Models.utils.ContactoComparatorNumeros;
import java.util.Set;
import java.util.TreeSet;

public class ContactoControllers {

   
    public void runTreeContacto(){
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparador());
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "2222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));
      
        for (Contacto contacto : agenda) {
            System.out.println(contacto);
            
        }
        

    }
    public void runTreeContactoConTelefono(){
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparatorNumeros());
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "2222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));
        
      
        for (Contacto contacto : agenda) {
            System.out.println(contacto);
            
        }
        // si el nombre es igual compare el telefono descendentemente
        

    }
    public void runTreeContactoNuevo(){
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparadorHash());
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales", "2222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));
      
        for (Contacto contacto : agenda) {
            System.out.println(contacto);
            
        }
    }


    

}
