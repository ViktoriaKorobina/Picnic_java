package org.example;

import java.util.*;

public class CounterWords {

    PicnicFruits picnicFruits = new PicnicFruits();

    /**
     * Метод, подсчитывающий, сколько фруктов определенного вида на пикнике и упорядочивающий их по убыванию количества
     * @return Упорядоченный по убыванию список фруктов на пикнике
     */
    public LinkedHashMap<String, Integer> countWords(){
        HashMap<String, Integer> map = new HashMap<>();
        String[] words = picnicFruits.getWords();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        while (!map.isEmpty()){
            HashMap.Entry<String, Integer> firstEntry =
                    (Map.Entry<String, Integer>) map.entrySet().iterator().next();
            Integer maxValue = Integer.valueOf(firstEntry.getValue());
            String maxKey = String.valueOf(firstEntry.getKey());
            for (String key: map.keySet()){
                if(map.get(key) > maxValue){
                    maxValue = map.get(key);
                    maxKey = key;
                }
            }
            linkedHashMap.put(maxKey, maxValue);
            map.remove(maxKey, maxValue);
        }
        return linkedHashMap;
    }
}
