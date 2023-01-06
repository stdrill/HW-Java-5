package org.example;

import java.util.HashMap;
import java.util.Map;

// Найти пересечения слов в массивах и указать их общее количество.
public class Task3 {
    public static void main(String[] args) {
        String[] mas1 = {"qwe", "asd", "qwe", "x"};
        String[] mas2 = {"qwe", "v"};
        Map<String, Integer> map = new HashMap<>();
        for (String word1 : mas1) {
            map.put(word1, 1);
            for (String word2 : mas2) {
                if (map.containsKey(word2)) {
                    map.put(word2, (map.get(word2) + 1));
                }
            }
            if (map.get(word1) == 1) {
                map.remove(word1);
            }
        }
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " пересекается: " + entry.getValue() + " раз(а)");
        }
    }
}
