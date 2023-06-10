
package s8.lab8p1_eduardochinchilla;

public class Libro {

    private String titulo;
    private String nombre;
    private int año;
    private Libro [][] mod;
    
    public Libro() {
        this.mod = mod;
    }

    public Libro(String titulo, String nombre, int año) {
        this.titulo = titulo;
        this.nombre = nombre;
        this.año = año;
        
    }

    public String getLibro() {
        return titulo;
    }

    public void setLibro(String libro) {
        this.titulo = libro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Libro[][] getMod() {
        return mod;
    }

    public void setMod(Libro[][] mod) {
        this.mod = mod;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
