package org.example;

import java.util.HashMap;
import java.util.Map;

// Подсчитать количество вхождения каждого слова
//Россия идет вперед всей планеты. Планета — это не Россия.
public class Task1 {
    public static void main(String[] args) {
        String text = "Россия идет вперед всей планеты. Планета — это  не Россия.";
        text = text.replaceAll("[-|–|—]|\\p{P}", " ");
        while (text.contains("  ")){
            text = text.replace("  ", " ");
        }
        String[] arrayString = text.split(" ");

        Map<String, Integer> map = getQuantity(arrayString);

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("Слово '" + entry.getKey() + "' встречается " + entry.getValue() + " раз");
        }
    }
    public static Map<String, Integer> getQuantity(String[] array){
        Map<String, Integer> map = new HashMap<>();
        for (String current : array){
            int count = map.getOrDefault(current.toLowerCase(), 0);
            map.put(current.toLowerCase(), ++count);
        }

        return map;
    }
}