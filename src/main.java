public class main {
    public static void main(String [] args) {
        RomanToNumeral romanToNumeral = new RomanToNumeral();
        System.out.println(romanToNumeral.convertRomanToNumeral("CMXCIX"));
        System.out.println(romanToNumeral.convertRomanToNumeral("XLIII"));
        System.out.println(romanToNumeral.convertRomanToNumeral("MMMMMX"));
        System.out.println(romanToNumeral.convertRomanToNumeral("CCD"));
        System.out.println(romanToNumeral.convertRomanToNumeral("CD"));
        System.out.println(romanToNumeral.convertRomanToNumeral("XLIIII"));
    }
}
