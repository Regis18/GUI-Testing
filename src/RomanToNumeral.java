import java.util.Hashtable;

public class RomanToNumeral {
    private Hashtable<String, Integer> romanValue = new Hashtable<String, Integer>();

    public static void main(String [] args) {
        RomanToNumeral romanToNumeral = new RomanToNumeral();
        System.out.println(romanToNumeral.convertRomanToNumeral("CMXCIX"));
        System.out.println(romanToNumeral.convertRomanToNumeral("XLIII"));
        System.out.println(romanToNumeral.convertRomanToNumeral("MMMMMX"));
        System.out.println(romanToNumeral.convertRomanToNumeral("CCD"));
        System.out.println(romanToNumeral.convertRomanToNumeral("CD"));
        System.out.println(romanToNumeral.convertRomanToNumeral("XLIIII"));
    }

    private void setRomanValues() {
        romanValue.put("I", 1);
        romanValue.put("V", 5);
        romanValue.put("X", 10);
        romanValue.put("L", 50);
        romanValue.put("C", 100);
        romanValue.put("D", 500);
        romanValue.put("M", 1000);
    }

    /**
     *
     */
    public int convertRomanToNumeral(String roman) {
        setRomanValues();
        int number = 0;
        int future;
        int present;
        int error = 0;
        int repetition = 0;
        try {
            for (int i = 0; i < roman.length(); i++) {
                present = romanValue.get(String.valueOf(roman.charAt(i)));
                if (i+1 < roman.length()) {
                    future = romanValue.get(String.valueOf(roman.charAt(i+1)));
                } else {
                    future = 0;
                }
                if (future > present) {
                    number = number - present;
                    if (error >= 1 && number < future) {
                        number = 0;
                        break;
                    }
                    error = 0;
                    if ((future == 1000) && (present == 100 || present == 500)) {
                        continue;
                    }
                    if (future == 500 && present == 100) {
                        continue;
                    }
                    if ((future == 100) && (present == 10 || present == 50)){
                        continue;
                    }
                    if (future == 50 && present == 10) {
                        continue;
                    }
                    if (future == 10 && (present == 1 || present == 5)) {
                        continue;
                    }
                    if (future == 5 && present == 1) {
                        continue;
                    }
                    number = 0;
                    break;
                } else {
                    number = number + present;
                    error += 1;
                    if (present == future && present != 1000) {
                        repetition += 1;
                        if (repetition == 3) {
                            number = 0;
                            break;
                        }
                    } else {
                        repetition = 0;
                    }
                }
            }
        } catch (NullPointerException event) {
            number = 0;
        }
        return number;
    }
}
