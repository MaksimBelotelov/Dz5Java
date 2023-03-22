package org.example.hw1;

// Подсчитать количество вхождения каждого слова в строку, удалить пунктуацию.

import java.util.HashMap;
import java.util.Map;

public class Ex01 {
    public static void main(String[] args) {
        String input = "Шалтай -         болтай сидел на       трубе. Шалтай - болтай шалтай свалился во сне!";

        Map<String, Integer> countWordsMap = new HashMap<>();
        input = input.replaceAll(" {2,}", " "); //удаляем лишние пробелы
        for(String word : input.replaceAll("[.,!?-]", "").toLowerCase().split(" ")) {
            if(!word.equals("")) {
                countWordsMap.putIfAbsent(word, 0);
                countWordsMap.put(word, countWordsMap.get(word) + 1);
            }
        }

        for(var el : countWordsMap.entrySet())
            System.out.println(el);
    }
}
