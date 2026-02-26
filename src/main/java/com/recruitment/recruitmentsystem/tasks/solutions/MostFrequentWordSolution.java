package com.recruitment.recruitmentsystem.tasks.solutions;

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

    /**
     * This is simple solution with for loops and no HashMap.
     * It has worse performance than HashMap solution, but it's simple.
     * @param text - strings separated by space
     * @return
     */
    public static String mostFrequentWord2(String text) {
        if(text == null || text.isEmpty()){
            return "";
        }

        List<String> allWordsArray = Arrays.asList(text.toLowerCase().trim().split(" "));
        Set<String> distinctWords = new HashSet<>(allWordsArray);

        String mostCommonWord = null;
        int mostCommonWordCount = 0;
        for(String wordToSearch : distinctWords) {
            int currentCount = 0;
            for(String word : allWordsArray) {
                if(wordToSearch.equals(word)) {
                    currentCount ++;
                }
            }

            if (currentCount > mostCommonWordCount) {
                mostCommonWord = wordToSearch;
                mostCommonWordCount = currentCount;
            }
        }

        return mostCommonWord;
    }
}
