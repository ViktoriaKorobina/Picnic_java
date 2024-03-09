package org.example;

public class Words {
    PicnicFruits picnicFruits = new PicnicFruits();

    /**
     * Метод подсчета фруктов на пикнике
     * @return Общее количество фруктов
     */
    public Integer countOfWords(){
        String[] array = picnicFruits.getWords();
        return array.length;
    }
}
