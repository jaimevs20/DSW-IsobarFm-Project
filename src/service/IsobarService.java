package service;

import com.google.gson.*;
import model.Album;
import model.Band;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class IsobarService {

    private static String isobarWSBands = "https://dws-recruiting-bands-api.dwsbrazil.io/api/bands";

    public static Band findBandByName(String band) throws Exception {
        try {
            URL url = new URL(isobarWSBands);
            HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();

            if(httpConnection.getResponseCode() == 200){
                BufferedReader response = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
                String parseJson = jsonToString(response);

                JsonArray jsonArray = JsonParser.parseString(parseJson).getAsJsonArray();

                for (JsonElement json: jsonArray) {

                    Gson gson = new Gson();
                    Band bandReturn = gson.fromJson(json, Band.class);
                    String bandName = bandReturn.getName().toUpperCase();

                    if(bandName.equals(band.toUpperCase())) {
                        return bandReturn;
                    }
                }
            }

            throw new RuntimeException("An error has happened - CODE:"+ httpConnection.getResponseCode());

        } catch (Exception e){
            throw new Exception("An error has happened: "+ e);
        }
    }

    public static List<Album> findAlbumByBand(String band) throws Exception {
        try {
            URL url = new URL(isobarWSBands);
            HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
            BufferedReader response = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
            String parseJson = jsonToString(response);

            if(httpConnection.getResponseCode() == 200){

                JsonArray jsonArray = JsonParser.parseString(parseJson).getAsJsonArray();
                List<Album> albumsReturnList = new ArrayList<>();

                for (JsonElement json: jsonArray) {
                    if (json.isJsonObject()) {
                        JsonArray jsonObjectArray = json.getAsJsonObject().get("albums").getAsJsonArray();

                        Gson gson = new Gson();
                        for (JsonElement jsonObjectOne : jsonObjectArray) {
                            Album albumsReturn = gson.fromJson(jsonObjectOne, Album.class);

                            if (albumsReturn.getBand().toUpperCase().equals(band.toUpperCase())) {
                                albumsReturnList.add(albumsReturn);
                            }
                        }
                    }
                }
                return albumsReturnList;
            }

            throw new RuntimeException("An error has happened - CODE:"+ httpConnection.getResponseCode());

        } catch (Exception e){
            throw new Exception("An error has happened: "+ e);
        }
    }

    public static String jsonToString(BufferedReader buffereReader) throws IOException {
        String line, jsonString = "";
        while ((line = buffereReader.readLine()) != null) {
            jsonString += line;
        }
        return jsonString;
    }
}
