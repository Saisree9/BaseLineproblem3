package com.tw.baselineproblem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ReceiptGeneratorTest {
    @Test
    public void shouldGenerateReceiptForExemptedItem() {
        ReceiptGenerator receiptGenerator = new ReceiptGenerator();
        String exemptedItems = "1 book at 12.49\n";
        Console console = mock(Console.class);
        receiptGenerator.printReceipt(exemptedItems, console);
        verify(console).display("1 book at 12.49\nSalesTax:0.00\ntotalCost:12.49");
    }

    @Test
    public void shouldCalculateTotalCostOfExemptedItems() {
        ReceiptGenerator receiptGenerator = new ReceiptGenerator();
        String exemptedItems = "1 book at 12.49\n";
        Double totalCost = receiptGenerator.calculateTotalCost(exemptedItems);
        assertEquals(12.49, totalCost, 0.00);
    }

}