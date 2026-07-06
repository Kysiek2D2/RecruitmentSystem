package com.recruitment.recruitmentsystem.tasks.solutions;

import java.util.*;

public class MostFrequentWordSolution {

    /**
    * This is the best solution with HashMap
    */
    public static String mostFrequentWordBest1(String text) {
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
    public static String mostFrequentWordSimple1(String text) {
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

    /**
     * This is VERY simple solution with for loops and no HashMap (version 2).
     * It has worse performance than HashMap solution, but it's VERY simple.
     */
    public static String mostFrequentWordSimple2(String text) {
        Map<String, Integer> result = new HashMap<>();
        String buffer="";
        char[] textChar = text.toCharArray();
        for(int i = 0; i < text.length(); i++){
            if(textChar[i] == ' ' || i == text.length()-1){
                if(result.get(buffer) != null){

                    buffer.trim();
                    result.put(buffer, result.get(buffer)+1);
                }
                else{
                    result.put(buffer, 1);
                }
                buffer="";
            }
            else
                buffer += textChar[i];
        }

        String resultString = "";
        int resultOccurances = 0;

        for(var r : result.entrySet()){
            System.out.println(r.getKey() + " "+ r.getValue());
            if(r.getValue() > resultOccurances){

                resultOccurances = r.getValue();
                resultString = r.getKey();
            }
        }

        return resultString;
    }
}
