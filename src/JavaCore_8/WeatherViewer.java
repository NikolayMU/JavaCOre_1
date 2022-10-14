package JavaCore_8;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class WeatherViewer {

    public static void consoleView(WeatherResponse data){
        System.out.println(data);
    }

    public static void processCity() throws IOException, SQLException {
        // бесконечный цикл опроса ввода из консоли.
        while (true) {
            System.out.println("Введите город  или для выхода из программы наберите 'выход'");
            Scanner sc = new Scanner(System.in);
            String city = sc.nextLine();
            if (city.equals("выход")) {
                break;
            } else if (city.contains("погода")) {
                String[] buff = city.split(" ");
                city = buff[1];
                WeatherController.printCityHistory(city);
            } else {
                WeatherResponse weather = WeatherController.getWeatherFromCityV2(city);
                if (weather.isEmpty()) {
                    System.out.println("Данных не могут быть предоставлены");
                } else {
                    consoleView(WeatherController.getWeatherFromCityV2(city));
                }
            }
        }
    }

}