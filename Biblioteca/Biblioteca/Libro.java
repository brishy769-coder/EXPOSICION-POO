package Biblioteca;

// Tema de esta biblioteca: Ciencia e ingeniería
public class Libro {
    String titulo;
    String autor;
    int anio;
    boolean disponible;

    // Constructor: crea un libro disponible por defecto
    public Libro(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.disponible = true;
    }

    // Método que Prestamo invocará (colaboración entre clases)
    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("  -> Libro prestado: \"" + titulo + "\" de " + autor);
        } else {
            System.out.println("  -> No se puede prestar: \"" + titulo + "\" ya está prestado.");
        }
    }

    public void devolver() {
        disponible = true;
        System.out.println("  -> Libro devuelto: \"" + titulo + "\"");
    }

    public void mostrarInfo() {
        String estado = disponible ? "Disponible" : "Prestado";
        System.out.println("- " + titulo + " | " + autor + " | " + anio + " | " + estado);
    }
}
