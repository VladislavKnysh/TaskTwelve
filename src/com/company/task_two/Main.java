package com.company.task_two;

import com.company.task_two.text_parser.TextParser;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        TextParser textParser = new TextParser();
        HashSet<String> stringArrayHashSet = textParser.parseNumbersArray("0613942431 +380663929431" +
                " 99999999999 asfdasf0654319431 dsfsdd fs asfdasfdsa+380999999999 0999999999");
        for (String s:stringArrayHashSet) {
            System.out.println(s);
        }
        System.out.println("\n");
        HashSet<String> stringListHashSet = textParser.parseNumbersList("0613942431 +380663929431" +
                " 99999999999 asfdasf0654319431 dsfsdd fs asfdasfdsa+380999999999 0999999999");
        for (String s:stringListHashSet) {
            System.out.println(s);
        }


    }
}
