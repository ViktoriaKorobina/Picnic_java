package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PicnicFruits {
    /**
     * Метод считывающий массив фруктов из файла
     * @return Массив фруктов
     */
    public String[] getWords() {
        List<String> list = new ArrayList<>();
        try {
            File file = new File("src/main/resources/input.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String st = br.readLine();
            String[] words = st.split(" ");

            for (int i = 0; i < words.length; i++) {
                if(!words[i].equals("")) {
                    words[i] = words[i].toLowerCase();
                    list.add(words[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] arrayFruits = list.toArray(new String[0]);
        return arrayFruits;
    }
}
