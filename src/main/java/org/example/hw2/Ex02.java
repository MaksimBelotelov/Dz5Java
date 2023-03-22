package org.example.hw2;

// Подсчитать количество вхождений искомого слова

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        String input = "Шалтай -         болтай сидел на       трубе. Шалтай - болтай шалтай свалился во сне!";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово для подсчета: ");
        String findWord = scanner.nextLine();

        System.out.println("Слово \"" + findWord + "\" встречается в строке " +
                countWordInString(findWord, input) + " раз(а).");
    }

    /**
     * Метод считает количество вхождений переданного слова в переданной строке
     * @param wordToCount слово, вхождения которого нужно посчитать
     * @param whereToFind строка, в которой искать слово
     * @return количество найденных вхождений
     */
    public static int countWordInString(String wordToCount, String whereToFind) {
        String inpStr = whereToFind.replaceAll(" {2,}", " ");
        Map<String, Integer> countWordMap = new HashMap<>();

        for(String word : inpStr.replaceAll("[.,!?-]", "").toLowerCase().split(" ")) {
            if(word.equals(wordToCount)) {
                countWordMap.putIfAbsent(word, 0);
                countWordMap.put(word, countWordMap.get(word) + 1);
            }
        }
        if(!countWordMap.isEmpty())
            return countWordMap.get(wordToCount);
        else
            return 0;
    }
}
