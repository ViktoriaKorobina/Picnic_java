package org.example;

public class LongestFruitsWord {
    PicnicFruits picnicFruits = new PicnicFruits();

    /**
     * Метод, определяющий фрукт с самым длинным названием
     * @return Самое длинное название фрукта
     */
    public String longestWord(){
        String longestWord = picnicFruits.getWords()[0];
        for (int i = 1; i < picnicFruits.getWords().length; i++) {
            if(picnicFruits.getWords()[i].length() > longestWord.length()){
                longestWord = picnicFruits.getWords()[i];
            }
        }
        return longestWord;
    }
}
