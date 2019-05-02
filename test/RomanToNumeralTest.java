import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToNumeralTest {
    private RomanToNumeral romanToNumeral;
    @BeforeEach
    void setUp() {
        romanToNumeral = new RomanToNumeral();
    }

    @Test
    void convertRomanToNumeral_returns999_whenSentMDCLXVI() {
        int actual = romanToNumeral.convertRomanToNumeral("MDCLXVI");
        assertEquals(1666, actual);
    }

    @Test
    void convertRomanToNumeral_returns999_whenSentCMXCIX() {
        int actual = romanToNumeral.convertRomanToNumeral("CMXCIX");
        assertEquals(999, actual);
    }

    @Test
    void convertRomanToNumeral_returns123_whenSentCxxiii() {
        int actual = romanToNumeral.convertRomanToNumeral("cxxiii");
        assertEquals(123, actual);
    }

    @Test
    void convertRomanToNumeral_returns0_whenSentCdIv() {
        int actual = romanToNumeral.convertRomanToNumeral("CdIv");
        assertEquals(404, actual);
    }

    @Test
    void convertRomanToNumeral_returns5010_whenSentMMMMMX() {
        int actual = romanToNumeral.convertRomanToNumeral("MMMMMX");
        assertEquals(5010, actual);
    }

    @Test
    void convertRomanToNumeral_returns0_whenSentXXXXX() {
        int actual = romanToNumeral.convertRomanToNumeral("XXXXX");
        assertEquals(0, actual);
    }

    @Test
    void convertRomanToNumeral_returns0_whenSentIIX() {
        int actual = romanToNumeral.convertRomanToNumeral("IIX");
        assertEquals(0, actual);
    }

    @Test
    void convertRomanToNumeral_returns0_whenSentIIV() {
        int actual = romanToNumeral.convertRomanToNumeral("IIV");
        assertEquals(0, actual);
    }

    @Test
    void convertRomanToNumeral_returns0_whenSentIIC() {
        int actual = romanToNumeral.convertRomanToNumeral("IIC");
        assertEquals(0, actual);
    }

    @Test
    void convertRomanToNumeral_returns0_whenSentXXC() {
        int actual = romanToNumeral.convertRomanToNumeral("XXC");
        assertEquals(0, actual);
    }


    @Test
    void convertRomanToNumeral_returns0_whenSentXXHI() {
        int actual = romanToNumeral.convertRomanToNumeral("XXHI");
        assertEquals(0, actual);
    }

    @Test
    void convertRomanToNumeral_returns0_whenSentHXXI() {
        int actual = romanToNumeral.convertRomanToNumeral("HXXI");
        assertEquals(0, actual);
    }

    @Test
    void convertRomanToNumeral_returns0_whenSent123() {
        int actual = romanToNumeral.convertRomanToNumeral("123");
        assertEquals(0, actual);
    }

    @Test
    void convertRomanToNumeral_returns0_whenSentCCCLLL() {
        int actual = romanToNumeral.convertRomanToNumeral("CCCLLL");
        assertEquals(0, actual);
    }

    @Test
    void convertRomanToNumeral_returns0_whenSentDD() {
        int actual = romanToNumeral.convertRomanToNumeral("DD");
        assertEquals(0, actual);
    }

    @Test
    void convertRomanToNumeral_returns0_whenSentVV() {
        int actual = romanToNumeral.convertRomanToNumeral("VV");
        assertEquals(0, actual);
    }
}