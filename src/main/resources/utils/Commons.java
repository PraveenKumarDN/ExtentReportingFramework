package resources.utils;

import java.util.Arrays;

/**
 * @author praveenkumar
 * This class helps in constructing common util methods like masking of a number etc.
 */
public class Constants {
    public String getMaskedNumber(String number, int startIndex, int endIndex, char Masking_Char) {
        char[] buff = new char[0];
        int length;

        length = number.length();
        if (length >= 8) {
            buff = number.toCharArray();
            Arrays.fill(buff, startIndex, length - endIndex, Masking_Char);
            number = new String(buff);
        }
        return number;
    }
}
