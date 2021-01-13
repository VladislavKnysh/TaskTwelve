package com.company.task_three;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInfoCollector {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> strings = new ArrayList<>();

    public UserInfoCollector() {
    }

    public void collectScannerInfo() {
        while (true) {
            System.out.println("Enter your data: ");
            String s = scanner.nextLine();
            if (s.equalsIgnoreCase("END")) {
                break;
            }else strings.add(s);
        }
    }


    public ArrayList<String> getStrings() {
        return strings;
    }
}
