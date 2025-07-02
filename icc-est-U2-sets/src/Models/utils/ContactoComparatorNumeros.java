package Models.utils;

import Models.Contacto;
import java.util.Comparator;

public class ContactoComparatorNumeros implements Comparator<Contacto>{

    @Override
    public int compare(Contacto o1, Contacto o2) {
        String nombre1 = o1.getNombre().toLowerCase();
        String nombre2 = o2.getNombre().toLowerCase();

        
        if (nombre1.equals("pedro") && !nombre2.equals("pedro")) {
            return -1;  
        }
        if (!nombre1.equals("pedro") && nombre2.equals("pedro")) {
            return 1;   
        }

       
        int result = nombre1.compareTo(nombre2);
        if (result != 0) {
            return result;
        }

        
        result = o1.getApellido().compareToIgnoreCase(o2.getApellido());
        if (result != 0) {
            return result;
        }

        
        return o1.getTelefono().compareTo(o2.getTelefono());
      
    }
    

}
