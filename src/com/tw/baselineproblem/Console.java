package com.tw.baselineproblem;

import java.util.Scanner;

public class Console {
    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void display(String receipt) {
        System.out.println(receipt);
    }
}
