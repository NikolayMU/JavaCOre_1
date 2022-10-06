package JavaCore_6;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.IOException;


public class OpenWeatherMap {

    //https://openweathermap.org/ - Основной сайт
    // прогноз погоды для Санкт-Петербурга (https://openweathermap.org/city/498817)

    private static ObjectMapper objectMapper = new ObjectMapper();
    private static String APPID = "da369a131f565392abac5572a9e622d8";

    static String host = "api.openweathermap.org";
    static String segment1 = "data";
    static String segment2 = "2.5";
    static String segment3 = "forecast";
    static String city = "498817";

    public static void main(String[] args) throws IOException {

        OkHttpClient client = new OkHttpClient();

        // построение URL c использованием сайта Openweathermap
        HttpUrl url = new HttpUrl.Builder()

                .scheme("http")
                .host(host)
                .addPathSegment(segment1)
                .addPathSegment(segment2)
                .addPathSegment(segment3)
                .addQueryParameter("q","city")
                .addQueryParameter("lang","ru")
                .addQueryParameter("units","metric")
                .addQueryParameter("APPID",APPID)
                .build();
        System.out.println(url.toString());


        Request requesthttp = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(url)
                .build();

        String jsonResponse = client.newCall(requesthttp).execute().body().string();
        System.out.println(jsonResponse);



    }
}
