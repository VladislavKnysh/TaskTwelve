package com.company.task_two.text_parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

class NumberParser {
    private String[] strings;



    NumberParser(String[] strings) {
        this.strings = strings;
    }


    String[] correctNumbersArray() {
        String[] correctedNumbers = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].matches("(\\+380)[\\d]{9}")) {
                correctedNumbers[i] = strings[i];
            } else if ((strings[i].matches("(0)[\\d]{9}"))) {
                correctedNumbers[i] = "+38" + strings[i].toString();
            }
        }
        return correctedNumbers;
    }


    List<String> correctNumbersList() {
        List<String> stringList = (Arrays.asList(strings));
        return stringList.stream()
                .filter(s -> (s.matches("(\\+380)[\\d]{9}") || s.matches("(0)[\\d]{9}")))
                .map(s -> {
                    if (s.matches("(\\+380)[\\d]{9}")) {
                        return s;
                    }else{return "+38"+ s;}})
                .collect(Collectors.toList());

    }

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }
}



