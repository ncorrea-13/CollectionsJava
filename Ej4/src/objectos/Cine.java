package objectos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Cine {

    ArrayList<Pelicula> lista;
    Scanner leer;

    public Cine() {
        lista = new ArrayList();
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public boolean crearPelicula() {

        System.out.print("Título =");
        String Titulo = leer.next();

        System.out.print("Autor =");
        String Autor = leer.next();

        System.out.print("Duración =");
        double duracion = leer.nextDouble();

        lista.add(new Pelicula(Titulo, Autor, duracion));
        return true;
    }

    public void mostrarPeliculas() {
        Iterator<Pelicula> iterador = lista.iterator();
        
        while (iterador.hasNext()) {
            Pelicula peli = (Pelicula) iterador.next();
            System.out.print(peli.toString());
            System.out.println("");
        }

    }

    public void mostrarUnaHora() {

    }

    public void ordenarDuracion() {

    }

    public void ordenarTitulo() {

    }

    public void ordenarAutor() {

    }

}
