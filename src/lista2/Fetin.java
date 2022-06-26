package lista2;

public class Fetin {

    private String titulo;
    private double nota;

    public Fetin(String titulo, double nota) {
        this.titulo = titulo;
        this.nota = nota;
    }
    public String getTitulo(){
       return titulo;
    }
    public double getNota() {
        return nota;
    }
}