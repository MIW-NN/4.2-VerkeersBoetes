package verkeersboetes.project.controller;

import verkeersboetes.project.model.ParkingFine;
import verkeersboetes.project.model.SpeedingFine;
import verkeersboetes.project.model.TrafficFine;

public class TrafficFineLauncher {

    public static void main(String[] args) {
        TrafficFine yourFine = new TrafficFine("Jan Smit", "49-ZK-FK");
        yourFine.setFineAmount(250.0);
        System.out.println(yourFine);

        ParkingFine myFine = new ParkingFine("Gerke de Boer", "02-VPR-3", 2);
        System.out.println(myFine);

        SpeedingFine josFine = new SpeedingFine("Jos Verstappen", "ZK-345-X", 158, 130);
        System.out.println(josFine);
    }
}
