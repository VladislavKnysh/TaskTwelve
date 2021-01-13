package com.company.task_two.text_parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

 class StringChopper {

    private final String stringToChop;
    private final String patternString;

     StringChopper(String stringToChop, String patternString) {
        this.stringToChop = stringToChop;
        this.patternString = patternString;
    }

     String[] generateArray() {
        Pattern pattern = Pattern.compile(this.patternString);
        Matcher matcher = pattern.matcher(stringToChop);
        int i = getNumberOfWords(matcher);
        String[] strings = new String[i];
        int j = 0;
        matcher.reset();
        while (matcher.find()) {


            strings[j++] = stringToChop.substring(matcher.start(), matcher.end());

        }
        return strings;
    }

    private int getNumberOfWords(Matcher matcher) {
        int i = 0;
        while (matcher.find()) {
            i++;
        }
        return i;
    }
}
