package com.recruitment.recruitmentsystem.tasks.services;

import java.util.*;

public class MostFrequentWordService {

    //Task: return most frequent word from the argument
    //example: for string "Java is great and Java is fun", function should return "java"
    public static String mostFrequentWord(String text) {
        Integer max = 0;
        String biggest = "nie mo";
        Map<String, Integer> mapa = new HashMap<>();
        //TODO
        var temp = Arrays.stream(text.split(" ")).toList();
        temp.forEach(e -> mapa.put(e, 0));
        for (String word : temp) {
            var entry = mapa.get(word);
            if( entry!= null) {
                mapa.put(word, entry + 1);
            }
        }
        for (var entry : mapa.entrySet()) {
            if (entry.getValue() > max) {
                biggest = entry.getKey();
                max = entry.getValue();
            }
        }

        return biggest;
    }
}
