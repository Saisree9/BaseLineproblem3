package com.tw.baselineproblem;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ApplicationTest {
    @Test
    public void shouldTakeInputFromTheCustomerWhenItStarts() {
        Console console = mock(Console.class);
        ReceiptGenerator receiptGenerator = new ReceiptGenerator();
        Application application = new Application(console, receiptGenerator);
        application.startApplication();
        verify(console).getInput();
    }

}