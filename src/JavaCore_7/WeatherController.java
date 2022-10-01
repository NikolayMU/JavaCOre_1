package JavaCore_7;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class WeatherController {

        private static ObjectMapper objectMapper = new ObjectMapper();


        public static WeatherResponse getWeather(String city) throws IOException {

                // а тут http запрос через okhttp
                OkHttpClient client = new OkHttpClient();

                HttpUrl httpUrl = new HttpUrl.Builder()
                        .scheme("http")
                        .host("dataservice.accuweather.com")
                        .addPathSegment("forecasts")
                        .addPathSegment("v1")
                        .addPathSegment("daily")
                        .addPathSegment("5day")
                        .addPathSegment("474212_PC") // пока оставил проверку только для определенного города(Санкт-Петербург).
                        .addQueryParameter("apikey",("tiVxmQFYIaIxGHnYgY4NzbApwR5Pmg5U"))
                        .addQueryParameter("language", "ru-ru")
                        .addQueryParameter("metric", "true")
                        .build();

                Request request = new Request.Builder()
                        .url(httpUrl)
                        .build();

                Response response = client.newCall(request).execute();
                String res = response.body().string();
                WeatherResponse result = objectMapper.readValue(res, WeatherResponse.class);
                return result;


            }
        }

