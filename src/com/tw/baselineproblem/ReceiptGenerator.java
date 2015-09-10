package com.tw.baselineproblem;

import java.util.ArrayList;
import java.util.List;

public class ReceiptGenerator {
    private List<String[]> listOfSplitedItems = new ArrayList<>();
    private Double totalCost = 0.0;

    public void printReceipt(String exemptedItems, Console console) {
        calculateTotalCost(exemptedItems);
        console.display(exemptedItems + "SalesTax:0.00" + "totalCost:" + totalCost);

    }

    public Double calculateTotalCost(String exemptedItems) {
        String[] listOfItems = exemptedItems.split("\n");
        for (String str : listOfItems) {
            listOfSplitedItems.add(str.split(" "));
        }
        for (String[] strings : listOfSplitedItems) {
            totalCost += new Double(strings[strings.length - 1]);
        }
        return totalCost;
    }

}
