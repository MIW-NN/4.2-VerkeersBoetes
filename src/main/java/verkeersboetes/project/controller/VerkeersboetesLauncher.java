package verkeersboetes.project.controller;

import verkeersboetes.project.model.ParkeerBoete;
import verkeersboetes.project.model.SnelheidsBoete;
import verkeersboetes.project.model.VerkeersBoete;

public class VerkeersboetesLauncher {

    public static void main(String[] args) {
        VerkeersBoete verkeersBoete = new ParkeerBoete("Jan Smit", "AB-123456", 3);
        System.out.println(verkeersBoete);

        SnelheidsBoete snelheidsBoete = new SnelheidsBoete("Jan Smit", "AB-123456", 90, 70);
        System.out.println(snelheidsBoete);
    }
}

