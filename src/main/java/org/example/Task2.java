package org.example;

import java.util.HashMap;
import java.util.Map;

// Подсчитать количество искомого слова, через map
public class Task2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String text = "Россия идет вперед всей планеты. Планета — это  не Россия.";
        text = text.replaceAll("[-|–|—]|\\p{P}", " ");
        while (text.contains("  ")) {
            text = text.replace("  ", " ");
        }
        String[] arrayString = text.split(" ");
        String word = "россия";
        map.put(word, 0);
        int count = map.getOrDefault(word.toLowerCase(), 0);
        for (String currentWord : arrayString) {
            if ((map.containsKey(word)) && (!word.toLowerCase().equals(currentWord.toLowerCase()))) {
                continue;
            }
            map.put(word.toLowerCase(), ++count);

        }
        for (var entry: map.entrySet()) {
            System.out.println("слово '" + entry.getKey() + "' встречается " + entry.getValue() + " раз");
        }
    }
}
