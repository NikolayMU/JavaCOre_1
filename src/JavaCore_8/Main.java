package JavaCore_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final WeatherClient WEATHER_CLIENT = new WeatherClient();
    private static final WeatherInfoRepository WEATHER_INFO_REPOSITORY = new WeatherInfoRepository();


    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("Choose what you want:");
                System.out.println("1. Fetch weather info");
                System.out.println("2. Get weather info");

                String command = reader.readLine();
                if ("exit".equalsIgnoreCase(command)) {
                    System.exit(0);
                } else {
                    if ("1".equalsIgnoreCase(command)) {
                        fetchFlow(reader);
                    } else if ("2".equalsIgnoreCase(command)) {
                        getFlow(reader);
                    } else {
                        System.out.println("Wrong menu choosing '" + command + "' try again");
                    }
                }
            }
        }
    }

    private static void fetchFlow(BufferedReader reader) throws IOException {
        System.out.println("Write city key location for fetch weather info");
        int cityKey = getCityKey(reader);
        WeatherInfoDTO weatherInfoDTO = WEATHER_CLIENT.getCity(cityKey);
        WEATHER_INFO_REPOSITORY.updateWeatherInfo(weatherInfoDTO);
    }

    private static void getFlow(BufferedReader reader) throws IOException {
        System.out.println("Write city key location for getting weather info from bd");
        int cityKey = getCityKey(reader);
        WeatherInfoDTO weatherInfoDTO = WEATHER_INFO_REPOSITORY.getWeatherInfo(cityKey);
        if (weatherInfoDTO == null) {
            System.out.println("Weather info by city key '" + cityKey + "' not found");
        } else {
            System.out.println("Weather info by city key: " + weatherInfoDTO);
        }
    }

    private static int getCityKey(BufferedReader reader) throws IOException {
        int cityKey;
        while (true) {
            String command = reader.readLine();
            if ("exit".equalsIgnoreCase(command)) {
                System.exit(0);
            } else {
                try {
                    cityKey = Integer.parseInt(command);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid city location key '" + command + "' try again");
                }
            }
        }
        return cityKey;
    }
}