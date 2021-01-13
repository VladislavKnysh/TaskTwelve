package com.company.task_three.expenses_calc;

public class Summary {
    private ExpensesCalculator expensesCalculator;

    public Summary(ExpensesCalculator expensesCalculator) {
        this.expensesCalculator = expensesCalculator;
    }

    public void printSummary() {
        int sum = +expensesCalculator.calculateSum();
        switch (expensesCalculator.getBusinessStatus()) {
            case ZERO -> {
                System.out.println(("Мы вышли в ноль :" + sum));
            }
            case PLUS -> {
                System.out.println(("Общий доход :" + sum));
            }
            case MINUS -> {
                System.out.println(("Общий убыток :" + sum));
            }
        }

        System.out.println("Доходы составляют " + expensesCalculator.calculateIncome() + ", из которых:");

        for (String s : expensesCalculator.calculateIncomeMap().keySet()) {
            System.out.println(s + ": " + expensesCalculator.calculateIncomeMap().get(s));
        }
        System.out.println("Расходы составляют " + expensesCalculator.calculateCosts() + " из которых:");
        for (String s : expensesCalculator.calculateCostsMap().keySet()) {
            System.out.println(s + ": " + expensesCalculator.calculateCostsMap().get(s));
        }
    }
}


