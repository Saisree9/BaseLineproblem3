package com.tw.baselineproblem;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ConsoleTest {
    @Test
    public void shouldGetInputFromCustomer() {
        Console input = mock(Console.class);
        when(input.getInput()).thenReturn("a\n b");
        assertEquals("a\n b", input.getInput());
    }

}