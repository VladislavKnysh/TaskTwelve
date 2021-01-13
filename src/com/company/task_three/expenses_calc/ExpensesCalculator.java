package com.company.task_three.expenses_calc;

import java.util.HashMap;

public class ExpensesCalculator {
    private BusinessStatus businessStatus;
    private HashMap<String, Integer> expensesHashMap;

    public ExpensesCalculator(HashMap<String, Integer> expensesHashMap) {
        this.expensesHashMap = expensesHashMap;
    }

    public int calculateSum() {
        int result = 0;
        for (int i : expensesHashMap.values()) {
            result += i;
        }
        updateBusinessStatus(result);
        return result;
    }

    public HashMap<String, Integer> calculateCostsMap() {
        HashMap<String, Integer> costs = new HashMap<>();
        for (String s : expensesHashMap.keySet()) {
            int i = expensesHashMap.get(s);
            if (i < 0) {
                costs.put(s, i);
            }
        }
        return costs;
    }
    public int calculateCosts(){
        int result=0;
        for (int i:expensesHashMap.values()) {
            if(i<0){
                result +=i;
            }
        }
        return result;
    }

    public HashMap<String, Integer> calculateIncomeMap() {
        HashMap<String, Integer> income = new HashMap<>();
        for (String s : expensesHashMap.keySet()) {
            int i = expensesHashMap.get(s);
            if (i > 0) {
                income.put(s, i);
            }
        }
        return income;
    }
    public int calculateIncome(){
        int result=0;
        for (int i:expensesHashMap.values()) {
            if(i>0){
                result +=i;
            }
        }
        return result;
    }

    private void updateBusinessStatus(int result) {
        if (result > 0) {
            businessStatus = BusinessStatus.PLUS;
        } else if (result < 0) {
            businessStatus = BusinessStatus.MINUS;
        } else {
            businessStatus = BusinessStatus.ZERO;
        }
    }

    public BusinessStatus getBusinessStatus() {
        return businessStatus;
    }

    enum BusinessStatus {
        ZERO,
        PLUS,
        MINUS;
    }
}
