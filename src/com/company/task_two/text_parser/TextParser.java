package com.company.task_two.text_parser;

import java.lang.reflect.Array;
import java.util.*;

public class TextParser {
    public TextParser() {
    }

    public HashSet<String> parseNumbersArray(String string) {
        StringChopper stringChopper = new StringChopper(string, "(\\+380)[\\d]{9}|(0)[\\d]{9}");
        NumberParser numberParser = new NumberParser(stringChopper.generateArray());
        String[] strings = numberParser.correctNumbersArray();
        HashSet<String> numberSet = new HashSet<>();
        numberSet.addAll(Arrays.asList(strings));
        return numberSet;
    }
    public HashSet<String> parseNumbersList(String string) {
        StringChopper stringChopper = new StringChopper(string, "(\\+380)[\\d]{9}|(0)[\\d]{9}");
        NumberParser numberParser = new NumberParser(stringChopper.generateArray());
        List<String> stringArrayList = numberParser.correctNumbersList();
        HashSet<String> numberSet = new HashSet<>();
        numberSet.addAll(stringArrayList);
        return numberSet;
}}

