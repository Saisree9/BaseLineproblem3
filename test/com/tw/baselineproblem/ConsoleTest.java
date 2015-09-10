package com.tw.baselineproblem;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

public class ConsoleTest {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Test
    public void shouldGetInputFromCustomer() {
        Console input = mock(Console.class);
        when(input.getInput()).thenReturn("1 book at 12.49");
        assertEquals("1 book at 12.49", input.getInput());
    }

    @Test
    public void shouldDisplayReceipt() {
        System.setOut(new PrintStream(output));
        Console displayReceipt = mock(Console.class);
        displayReceipt.display("1 book at 12.49");
        Mockito.verify(displayReceipt, times(1)).display("1 book at 12.49");
    }

}