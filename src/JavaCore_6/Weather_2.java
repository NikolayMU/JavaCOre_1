package JavaCore_6;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.IOException;

public class Weather_2 {

    public static void main(String[] args) throws IOException {

        OkHttpClient client = new OkHttpClient();

        // построение URL c использованием сайта Yandex
        HttpUrl url = new HttpUrl.Builder()

                .scheme("https")
                .host("yandex.ru")
                .addPathSegment("pogoda")
                .addPathSegment("saint-petersburg")
                .addQueryParameter("apikey",("84560f66-0fdd-4470-95c3-6ea95d9fc16a"))
                .addQueryParameter("language", "ru-ru")
                .addQueryParameter("metric", "true")
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

