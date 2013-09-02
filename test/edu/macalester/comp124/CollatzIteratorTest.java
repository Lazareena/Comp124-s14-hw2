package edu.macalester.comp124;

import static org.junit.Assert.*;

import org.junit.Test;

public class CollatzIteratorTest {
    @Test
    public void findsRecord() {
        CollatzIterator collatz = new CollatzIterator();
        assertEquals(9, collatz.recordSettingSeed(10));
        assertEquals(54, collatz.recordSettingSeed(60));
    }
    
    @Test
    public void maxCanBeRecord() {
        CollatzIterator collatz = new CollatzIterator();
        assertEquals(6, collatz.recordSettingSeed(6));
        assertEquals(9, collatz.recordSettingSeed(9));
    }
    
    @Test
    public void smallMaxAlwaysReturns1() {
        // This is a special / degenerate case: CollatzIterator treats every
        // max less than 1 as if it were 1.
        CollatzIterator collatz = new CollatzIterator();
        assertEquals(1, collatz.recordSettingSeed(1));
        assertEquals(1, collatz.recordSettingSeed(0));
        assertEquals(1, collatz.recordSettingSeed(-10));
    }
}
