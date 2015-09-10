package com.tw.baselineproblem;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ApplicationTest {
    @Test
    public void shouldTakeInputFromTheCustomerWhenItStarts() {
        Console console = mock(Console.class);
        ReceiptGenerator receiptGenerator = new ReceiptGenerator();
        Application application = new Application(console, receiptGenerator);
        application.startApplication();
        verify(console).getInput();
    }

    @Test
    public void shouldPrintReceiptForTheItems() {
        Console console = mock(Console.class);
        ReceiptGenerator receiptGenerator = new ReceiptGenerator();
        Application application = new Application(console, receiptGenerator);
        application.startApplication();
        when(console.getInput()).thenReturn("1 book at 12.49");
        verify(console).display("1 book at 12.49\nSalesTax:0.00\ntotalCost:12.49");
    }

}