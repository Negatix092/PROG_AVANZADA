import java.util.ArrayList;

public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int numEdiciones;
    private String ultEdicion;
    private ArrayList<String> palabrasClaves;
    private double precio;

    public Libro(){

    }
    //constructor de la clase Libro
    public Libro(String ISBN, String titulo, String autor, int numEdiciones, String ultEdicion, ArrayList<String> palabrasClaves, double precio) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numEdiciones = numEdiciones;
        this.ultEdicion = ultEdicion;
        this.palabrasClaves = palabrasClaves;
        this.precio = precio;
    }

    //metodo para imprimir los datos del libro 
    public void traverse(){
        System.out.println("ISBN: " + this.ISBN + ", Titulo: " + this.titulo + ", Autor: " + this.autor + ", Nro de ediciones: " +
                this.numEdiciones + ", Ultima edicion: " + this.ultEdicion +
                ", Palabras clave: " + this.palabrasClaves + ", Precio: " + this.precio);
    }

    //metodos set y get para cada parametro de cada libro
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumEdiciones() {
        return numEdiciones;
    }

    public void setNumEdiciones(int numEdiciones) {
        this.numEdiciones = numEdiciones;
    }

    public String getUltEdicion() {
        return ultEdicion;
    }

    public void setUltimaEdicion(String ultEdicion) {
        this.ultEdicion = ultEdicion;
    }

    //las palabras clave son manejadas como un ArrayList
    public ArrayList<String> getPalabrasClaves() {
        return palabrasClaves;
    }

    public void setPalabrasClaves(ArrayList<String> palabrasClaves) {
        this.palabrasClaves = palabrasClaves;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
