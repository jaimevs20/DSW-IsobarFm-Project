package controller;

import model.Album;
import model.Band;
import service.IsobarService;

import java.util.List;
import java.util.Scanner;

public class IsobarController {
    public static void main(String[] args) throws Exception {
        System.out.print("Put the band's name to find: ");
        String bandName = new Scanner(System.in).nextLine();
        Band bandInformation = IsobarService.findBandByName(bandName);
        List<Album> albumBandInformation = IsobarService.findAlbumByBand(bandName);

        System.out.println(bandInformation.getName() + "\nPlays: "+ bandInformation.getNumPlays());
        System.out.println("Albums: "+ albumBandInformation);
    }
}
