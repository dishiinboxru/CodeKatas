package com.shimanskii;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample {
    public static void main(String[] args) {
        Map<String, Integer> wordcount = new HashMap<>();

        String yellowSubmarine =
                "We all live in a yellow submarine\n" +
                        "Yellow submarine, yellow submarine\n" +
                        "We all live in a yellow submarine\n" +
                        "Yellow submarine, yellow submarine\n";
        yellowSubmarine = yellowSubmarine.toLowerCase()
                .replaceAll("\n", " ")
                .replaceAll(",", "");
        String[] inputStringInArray = yellowSubmarine.split(" ");
        List<String> list = Arrays.asList(inputStringInArray);
        System.out.println(list);
        for (String item : args){
            wordcount.put(item,0);

        }
        for (String word : list){
            if (Arrays.asList(args).contains(word)){
                wordcount.put(word, wordcount.get(word) + 1);
            }

        }


            wordcount.forEach((k, v) -> System.out.println((k + ":" + v)));

    }
}
