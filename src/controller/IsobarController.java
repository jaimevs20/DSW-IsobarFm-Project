package controller;

import model.Band;
import service.IsobarService;

import java.util.Scanner;

public class IsobarController {
    public static void main(String[] args) throws Exception {
        System.out.print("Put the band's name to find: ");
        String bandName = new Scanner(System.in).nextLine();
        Band bandInformation = IsobarService.findBandByName(bandName);

        System.out.println(bandInformation.getName() + "\nPlays: "+ bandInformation.getNumPlays());
    }
}
