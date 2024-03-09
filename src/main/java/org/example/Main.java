package org.example;

public class Main {
    public static void main(String[] args) {
        PicnicFruits picnicFruits = new PicnicFruits();
        String[] arrayFruits = picnicFruits.getWords();
        for (int i = 0; i < arrayFruits.length; i++) {
            System.out.println(arrayFruits[i]);
        }
        Words words = new Words();
        System.out.println("Всего фруктов на пикнике " + words.countOfWords());
        LongestFruitsWord longestFruitsWord = new LongestFruitsWord();
        System.out.println("Фрукт с самым длинным названием: " + longestFruitsWord.longestWord());
        CounterWords counterWords = new CounterWords();
        System.out.println("Подсчет фруктов на пикнике: \n" + counterWords.countWords());
    }
}