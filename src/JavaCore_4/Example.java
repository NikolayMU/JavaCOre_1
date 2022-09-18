package JavaCore_4;

import java.util.*;

// Задание №1
public class Example {
    public static void main(String[] args) {
        String[] words = {"Руль", "Сцепление", "Лампа 5W12", "Сидение", "АКПП", "Педали", "Сигнал", "Масло", "Ключ",
                "Педали", "АКПП", "Руль", "Сигнал", "Глушитель", "Свеча", "Масло", "Ключ", "Педали", "Сигнал"};

        // Использовал метод HashMap (ключ:значение)
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        // Определение уникальных значений
        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

    }
}
