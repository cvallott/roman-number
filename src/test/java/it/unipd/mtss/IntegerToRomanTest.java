////////////////////////////////////////////////////////////////////
// [CATERINA] [VALLOTTO] [2076434]
// [VICTORIA] [DURNEA] [2076324]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {
    @Test
    public void testConvert1to50() {
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("X", IntegerToRoman.convert(10));
        assertEquals("XX", IntegerToRoman.convert(20));
        assertEquals("XL", IntegerToRoman.convert(40));
        assertEquals("L", IntegerToRoman.convert(50));
        assertEquals("Numero non valido", IntegerToRoman.convert(51));
        assertEquals("Numero non valido", IntegerToRoman.convert(0));
    }
}