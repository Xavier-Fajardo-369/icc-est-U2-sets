package controllers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public Sets() {
        
    }

    public String construirHashSet() {
        Set<String> palabras = new HashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop"); 
        palabras.add("Celular"); 
        return palabras.toString();
        
    }
    public String construirTreeSet() {
        Set<String> palabras = new TreeSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        return palabras.toString();
        
    
    }
    public String construirLinkedHashSet() {
        Set<String> palabras = new LinkedHashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop"); 
        palabras.add("Celular"); 
        return palabras.toString();
        
    }
    public Set<String> construirTreeSetConComparador() {
        // Implementación de un  comparador para comparacion especifica
        Comparator<String> comparador = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                //Primero comparamos por longitud
                int result = Integer.compare(s1.length(), s2.length());
                //Si son iguales en longitud, comparamos por orden alfabético
                if (result == 0) {
                    return s1.compareTo(s2);
                }
                return result;

            }

        };
        Set<String> palabras = new TreeSet<>(comparador);
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        palabras.add("Celulas");
        return palabras;
       
    }
    public String construirTreeSetConComparadorPorUltimaLetra() {
        // Implementación de un comparador para comparar por última letra
        Comparator<String> comparador = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                char ultimaLetraS1 = s1.charAt(s1.length() - 1);
                char ultimaLetraS2 = s2.charAt(s2.length() - 1);
                return Character.compare(ultimaLetraS1, ultimaLetraS2);
            }
        };
        Set<String> palabras = new TreeSet<>(comparador);
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("celular");
        return palabras.toString();
        
    }
   


    
}
