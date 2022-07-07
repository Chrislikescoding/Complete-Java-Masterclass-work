package com.example.mypackage;

import static org.junit.jupiter.api.Assertions.*;

public class UtilitiesTest {
private Utilities util;

    @org.junit.Before
    public void setup() {
     util = new Utilities();
    }

    @org.junit.Test

    public void everyNthChar() throws Exception {
         char[] output =  util.everyNthChar(new char [] {'C','h','r','i','s','t','i','n','e'}, 2);
         assertArrayEquals(new char [] {'h','i','t','n'},output);
        char[] output2 =  util.everyNthChar(new char [] {'C','h','r','i','s','t','i','n','e'}, 10);
        assertArrayEquals(new char [] {'C','h','r','i','s','t','i','n','e'}, output2);
    }

    @org.junit.Test
    public void removePairs() throws Exception{
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
      //  assertNull("Did not get null returned when argument passed was null", util.removePairs(null));
        assertEquals("A", util.removePairs("A"));
        assertEquals("", util.removePairs(""));
    }

    @org.junit.Test(expected=ArithmeticException.class)
    public void converter_arithmeticException () throws Exception {
          assertEquals(0, util.converter(10, 0));
    }
    @org.junit.Test
    public void converter() throws Exception{
      assertEquals(300, util.converter(10,5));
    }

    @org.junit.Test
    public void nullIfOddLength() throws Exception{
        assertNull( util.nullIfOddLength("123"));
        assertNotNull( util.nullIfOddLength("1234"));
      }
}