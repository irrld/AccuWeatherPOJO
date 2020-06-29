package net.teon.weatherapi;

import com.google.gson.Gson;
import org.omg.CORBA.StringHolder;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;

public class WeatherAPI {
    public static Weather getWeather(String key, String lang){
        return getWeather(key,lang,"318251");
    }
    public static Weather getWeather(String key, String lang, String locationID){
        try {
            String req = readJsonFromUrl("http://dataservice.accuweather.com/currentconditions/v1/" + locationID + "?apikey=" + key + "&language=" + lang + "&details=" + true);
            return new Gson().fromJson(req.substring(1,req.length() - 1),Weather.class);
        } catch (Exception e) {
            return null;
        }
    }


    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    private static String readJsonFromUrl(String url) throws IOException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            return readAll(rd);
        } finally {
            is.close();
        }
    }

}
