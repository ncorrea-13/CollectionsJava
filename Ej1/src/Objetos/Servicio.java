package Objetos;

import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in);
    Perro raza = new Perro();

    public Servicio() {
    }

    public String crearRaza() {
        System.out.println("Dicte la raza que desea crear");
        raza.setRaza(leer.next());

        return raza.getRaza();
    }

    public int seguirAgregando() {
        System.out.println("Desea agregar otra raza?");
        String rta = leer.next();
        int i = 0;
        switch (rta) {
            case "S":
                i=1;
            case "N":
                break;
            default:
                System.out.println("No ha introducido una respuesta válida");
                System.out.println("Vuelva a intentarlo");
                seguirAgregando();
        }
        return i;
    }

}
