package objectos;

public class Pelicula {

    private String Titulo;
    private String Director;
    private double Duracion;

    public Pelicula(String Titulo, String Director, double Duracion) {
        this.Titulo = Titulo;
        this.Director = Director;
        this.Duracion = Duracion;
    }

    public Pelicula() {
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public void setDuracion(Integer Duracion) {
        this.Duracion = Duracion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getDirector() {
        return Director;
    }

    public double getDuracion() {
        return Duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Titulo=" + Titulo + ", Director=" + Director + ", Duracion=" + Duracion + '}';
    }
    
}
