
package Biblioteca;

public class Main {
    public static void main(String[] args) {

        System.out.println("##### BIBLIOTECA: CIENCIA E INGENIERÍA #####\n");

        // 1. Creamos 20 objetos de la clase Libro
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

        
        Libro libro11 = new Libro("Álgebra de Baldor", "Aurelio Baldor", 1941);
        Libro libro12 = new Libro("Fundamentos de Física", "David Halliday", 1960);
        Libro libro13 = new Libro("La estructura de las revoluciones científicas", "Thomas Kuhn", 1962);
        Libro libro14 = new Libro("Cosmos", "Carl Sagan", 1980);
        Libro libro15 = new Libro("Introducción a la mecánica", "Kleppner y Kolenkow", 1973);
        Libro libro16 = new Libro("Química", "Raymond Chang", 1984);
        Libro libro17 = new Libro("La doble hélice", "James D. Watson", 1968);
        Libro libro18 = new Libro("El universo en una cáscara de nuez", "Stephen Hawking", 2001);
        Libro libro19 = new Libro("Geometría analítica", "Charles H. Lehmann", 1950);
        Libro libro20 = new Libro("Cálculo diferencial e integral", "Granville", 1904);

        // Agrupamos los 20 libros en un arreglo
        Libro[] biblioteca = {
            libro1, libro2, libro3, libro4, libro5,
            libro6, libro7, libro8, libro9, libro10,
            libro11, libro12, libro13, libro14, libro15,
            libro16, libro17, libro18, libro19, libro20
        };

        System.out.println("===== CATÁLOGO INICIAL =====");
        for (Libro libro : biblioteca) {
            libro.mostrarInfo();
        }

        // 2. Creamos préstamos y pasamos un objeto Libro completo
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
