package Models.utils;

import Models.Contacto;
import java.util.Comparator;

public class ContactoComparador implements Comparator<Contacto> {

    @Override
    public int compare(Contacto o1, Contacto o2) {
        //primero comparo por el apellido alfabeticamente
        int resultComparacionConApellido = o1.getApellido().compareToIgnoreCase(o2.getApellido());
        if(resultComparacionConApellido != 0){
            return resultComparacionConApellido;
        }
        int resultComparacionConNombre = o1.getNombre().compareToIgnoreCase(o2.getNombre());
        return resultComparacionConNombre;

        
    }


}
