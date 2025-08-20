package com.recruitment.recruitmentsystem.tasks.solutions;
import org.springframework.stereotype.Service;

import java.util.*;

public class MostFrequentWordSolution {

    public static String mostFrequentWord(String text) {
        if(text == null || text.isEmpty()){
            return "";
        }

        Map<String, Integer> wordsOccurencies = new HashMap<>();

        String[] wordsList = text.toLowerCase().split(" ");

        for (String word : wordsList){
            wordsOccurencies.put(word, wordsOccurencies.getOrDefault(word, 0) + 1);
        }

        String topWord = "";
        int maxOccurencies = 0;
        for(Map.Entry<String, Integer> entry : wordsOccurencies.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            if(entry.getValue() > maxOccurencies) {
                topWord = entry.getKey();
                maxOccurencies = entry.getKey().length();
            }
        }

        return topWord;

    }
}
