package com.recruitment.recruitmentsystem.simple.main;

import com.recruitment.recruitmentsystem.tasks.services.MostFrequentWordService;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(MostFrequentWordService.mostFrequentWord("ab ab c z z r r ab"));
    }
}
