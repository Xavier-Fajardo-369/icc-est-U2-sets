package controllers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicios {
    private static final String texto1 = "¡Hola! La programación en Java es muy divertida, sobre todo cuando se entienden los conceptos.";
    private static final String texto2 = "Java es divertido. Aprender programación puede ser un reto, pero también muy gratificante.";

    public Ejercicios() {
       
        System.out.println(tieneDuplicados(new int[]{1,2,3,4,5}));
        System.out.println(tieneDuplicados(new int[]{1,2,3,4,5,4,3,2,45}));
        System.out.println("Ejercicio 2:");
        System.out.println(esIsograma("murcielago"));
        System.out.println(esIsograma("camaleon"));
        System.out.println("Ejercicio 3:");
        System.out.println(contarPalabrasUnicas("   La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?\n" + 
                        "                    Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.\n" + 
                        "                    En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas."));
        System.out.println("Ejercicio 4:");
        compararTextos(texto1, texto2);
        
    }


        
    
    public boolean tieneDuplicados(int[] numeros) {
        Set<Integer> set = new HashSet<>();
        for (int numero : numeros) {
            if (!set.add(numero)) {
                return true; 
            }
        }
        return false; 
    }
    public boolean esIsograma(String palabra){
        Set<Character> set = new HashSet<>();
        for (char letra : palabra.toCharArray()) {
            if (!set.add(letra)) {
                return false; 
            }
        }
        return true; 
    }
    public int contarPalabrasUnicas(String frase){
        Set<String> palabrasUnicas = new HashSet<>();
        
        String[] palabras = frase.toLowerCase().replaceAll("[^a-záéíóúüñ\\s]", "").split("\\s+");
        for (String palabra : palabras) {
            if (!palabra.isBlank()) {
                palabrasUnicas.add(palabra);
            }
        }
        return palabrasUnicas.size();
    }
    public void compararTextos(String texto1, String texto2) {
        Set<String> set1 = new HashSet<>(Arrays.asList(texto1.toLowerCase().replaceAll("[^a-záéíóúüñ\\s]", "").split("\\s+")));
        Set<String> set2 = new HashSet<>(Arrays.asList(texto2.toLowerCase().replaceAll("[^a-záéíóúüñ\\s]", "").split("\\s+")));

        System.out.println("Texto 1: " + set1.size() + " palabras únicas");
        System.out.println("Texto 2: " + set2.size() + " palabras únicas");

        Set<String> comunes = new TreeSet<>(set1);
        comunes.retainAll(set2);
        System.out.println("Cuantas palabras comunes: " + comunes.size());

        int totalUnicas = set1.size() + set2.size();
        double coincidencia = (2.0 * comunes.size()) / totalUnicas * 100;
        System.out.printf("Coincidencia léxica: %.2f%%\n", coincidencia);

        Set<String> soloTexto1 = new TreeSet<>(set1);
        soloTexto1.removeAll(set2);
        System.out.println("Solo en texto 1: " + soloTexto1);

        Set<String> soloTexto2 = new TreeSet<>(set2);
        soloTexto2.removeAll(set1);
        System.out.println("Solo en texto 2: " + soloTexto2);
      
       
       
    }

    
    
    
}
