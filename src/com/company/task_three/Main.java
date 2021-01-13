package com.company.task_three;

import com.company.task_three.expenses_calc.ExpensesCalculator;
import com.company.task_three.expenses_calc.ExpensesRegister;
import com.company.task_three.expenses_calc.Summary;

import java.util.ArrayList;

 class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("-700 закупка аппаратуры");
        arrayList.add("-150 услуги почты");
        arrayList.add("+2000 продажа товара");
        arrayList.add("-200 услуги почты");
        arrayList.add("-100 неплановые расходы");
        arrayList.add("+7525 продажа товара");
        ExpensesRegister expensesRegister = new ExpensesRegister(arrayList);
        expensesRegister.expensesToHashMap();
        ExpensesCalculator expensesCalculator = new ExpensesCalculator(expensesRegister.getExpensesHashMap());
        Summary summary = new Summary(expensesCalculator);
        summary.printSummary();

    }


}

 class MainScanner {
    public static void main(String[] args) {
        UserInfoCollector userInfoCollector = new UserInfoCollector();
        userInfoCollector.collectScannerInfo();
       ExpensesRegister expensesRegister = new ExpensesRegister(userInfoCollector.getStrings());
        expensesRegister.expensesToHashMap();
        ExpensesCalculator expensesCalculator = new ExpensesCalculator(expensesRegister.getExpensesHashMap());
        Summary summary = new Summary(expensesCalculator);
        summary.printSummary();
    }
}

