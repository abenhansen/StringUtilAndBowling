package util;

public class StringUtil {
    public static String reverseString(String stringToReverse) {
        char[] charArray = stringToReverse.toCharArray();
        for(int i = 0; i < charArray.length/2; i++) {
            char tempoary = charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = tempoary;
        }
        stringToReverse = new String(charArray);
        return stringToReverse;
    }

    public static String toUpperCase(String string) {
        char[] charArray = string.toCharArray();
        int i = 0;
        for(char charInString: charArray){
            charArray[i] = Character.toUpperCase(charInString);
            i++;
        }
        string = new String(charArray);
        return string;
    }

    public static String toLowerCase(String string) {
        char[] charArray = string.toCharArray();
        int i = 0;
        for(char charInString: charArray){
            charArray[i] = Character.toLowerCase(charInString);
            i++;
        }
        string = new String(charArray);
        return string;
    }
}
