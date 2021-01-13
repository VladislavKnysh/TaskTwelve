package com.company.task_three.expenses_calc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ExpensesRegister {
    private ArrayList<String> expenses;
    private HashMap<String, Integer> expensesHashMap = new HashMap<>();

    public ExpensesRegister(ArrayList<String> expenses) {
        this.expenses = expenses;

    }

    private ArrayList<String> filterOutExpenses() {
        return expenses.stream()
                .filter(s -> s.charAt(0) == ('+') || s.charAt(0) == '-')
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public void expensesToHashMap() {
        ArrayList<String> filteredExpenses = filterOutExpenses();
        for (String s : expenses) {
            String key = parseKey(s);
            Integer value = parseExpenses(s);
            if (expensesHashMap.containsKey(key)) {
                expensesHashMap.put(key, expensesHashMap.get(key) + value);
            } else {
                expensesHashMap.put(key, value);
            }
        }
    }

    private String parseKey(String s) {
        Matcher matcher = Pattern.compile("[а-яА-Я]+[\\s][а-яА-Я]*").matcher(s);
        matcher.find();
        return matcher.group();
    }

    private Integer parseExpenses(String s) {
        Matcher matcher = Pattern.compile("[\\+|-][\\d]+").matcher(s);
        matcher.find();
        return Integer.parseInt(matcher.group());
    }


    public HashMap<String, Integer> getExpensesHashMap() {
        return expensesHashMap;
    }
}
