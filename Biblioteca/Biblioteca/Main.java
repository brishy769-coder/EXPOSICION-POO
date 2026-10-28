package Biblioteca;

public class Main {
    public static void main(String[] args) {

        System.out.println("##### BIBLIOTECA: CIENCIA E INGENIERÍA #####\n");

        // 1. Creamos 10 objetos (instancias) de la clase Libro
        Libro libro1  = new Libro("Breve historia del tiempo", "Stephen Hawking", 1988);
        Libro libro2  = new Libro("El origen de las especies", "Charles Darwin", 1859);
        Libro libro3  = new Libro("Principia", "Isaac Newton", 1687);
        Libro libro4  = new Libro("Lecciones de Física", "Richard Feynman", 1963);
        Libro libro5  = new Libro("Sobre la electrodinámica", "Albert Einstein", 1905);
        Libro libro6  = new Libro("El gen egoísta", "Richard Dawkins", 1976);
        Libro libro7  = new Libro("Sobre las revoluciones", "Nicolás Copérnico", 1543);
        Libro libro8  = new Libro("Física Universitaria", "Sears y Zemansky", 2001);
        Libro libro9  = new Libro("Primavera silenciosa", "Rachel Carson", 1962);
        Libro libro10 = new Libro("Cálculo", "James Stewart", 1996);

        // Los agrupamos en un arreglo para recorrerlos fácilmente
        Libro[] biblioteca = {
            libro1, libro2, libro3, libro4, libro5,
            libro6, libro7, libro8, libro9, libro10
        };

        System.out.println("===== CATÁLOGO INICIAL =====");
        for (Libro libro : biblioteca) {
            libro.mostrarInfo();
        }

        // 2. Creamos préstamos y les pasamos un objeto Libro completo
        System.out.println("\n===== PRÉSTAMOS =====");
        Prestamo prestamo1 = new Prestamo("10/11/2026");
        prestamo1.procesarPrestamo(libro4);

        Prestamo prestamo2 = new Prestamo("11/11/2026");
        prestamo2.procesarPrestamo(libro8);

        Prestamo prestamo3 = new Prestamo("12/11/2026");
        prestamo3.procesarPrestamo(libro10);

        // Intento de prestar un libro que ya está prestado
        Prestamo prestamo4 = new Prestamo("13/11/2026");
        prestamo4.procesarPrestamo(libro8);

        // 3. Devolución
        System.out.println("\n===== DEVOLUCIONES =====");
        libro4.devolver();

        System.out.println("\n===== CATÁLOGO FINAL =====");
        for (Libro libro : biblioteca) {
            libro.mostrarInfo();
        }
    }
}
