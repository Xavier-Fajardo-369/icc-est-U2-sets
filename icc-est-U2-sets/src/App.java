
import controllers.ContactoControllers;
//import controllers.Sets;



public class App {
    public static void main(String[] args) throws Exception {
        //Sets sets = new Sets();
        /* 
        runLinkedHashSet(sets);
        runHashSet(sets);
        runTreeSet(sets);
        runTreeSetConComparador(sets);
        runTreeSetConComparadorPorUltimaLetra(sets);
        */
        ContactoControllers contacto = new ContactoControllers();
        System.out.println("Ordenada por Apellido - Nombre");
        contacto.runTreeContacto();
        System.out.println("Agenda ordenada por Apellido - Nombre - Telefono");
        contacto.runTreeContactoConTelefono();
        System.out.println("Agenda ordenada por Hashcode");
        contacto.runTreeContactoNuevo();
    /*   
    }
    public static void runHashSet(Sets sets) {
        System.out.println();
        System.out.println("HashSet: " + sets.construirHashSet());
    }
    public static void runLinkedHashSet(Sets sets) {
        System.out.println();
        System.out.println("LinkedHashSet: " + sets.construirLinkedHashSet());
       
    }
    public static void runTreeSet(Sets sets) {
        System.out.println();
        System.out.println("TreeSet: " + sets.construirTreeSet());
    }
    public static void runTreeSetConComparador(Sets sets) {
        System.out.println();
        System.out.println("TreeSet con Comparador: " + sets.construirTreeSetConComparador());
      
    }
    public static void runTreeSetConComparadorPorUltimaLetra(Sets sets) {
        System.out.println();
        System.out.println("TreeSet con Comparador por ultima letra: " + sets.construirTreeSetConComparadorPorUltimaLetra());
    }
    */
    }
}
