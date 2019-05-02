import java.util.Hashtable;

/**
 * RomanToNumeral
 *
 * @author Regis Humana
 * @version 0.0.1
 */
public class RomanToNumeral {

    private Hashtable<String, Integer> romanValue = new Hashtable<String, Integer>();

    /**
     * Set all of Roman values into a Dictionary with their respective natural number values.
     */
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
     * Convert a Roman number into Natural name.
     */
    public int convertRomanToNumeral(String roman) {
        roman = roman.toUpperCase();
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
                        if ((repetition == 3) || (present == 5 ||present == 50 || present == 500)) {
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
