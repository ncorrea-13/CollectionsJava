package ej1;

import Objetos.Servicio;
import java.util.ArrayList;

public class Ej1 {

    public static void main(String[] args) {
        ArrayList<String> Lista = new ArrayList();
        Servicio service = new Servicio();
        int i = 1;
        while (i == 1) {
            Lista.add(service.crearRaza());
            i = service.seguirAgregando();
        }

        System.out.println(Lista.toString());
    }

}
