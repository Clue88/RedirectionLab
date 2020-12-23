import java.util.*;
public class PigLatin {
    public static void main(String[] args) {
        System.out.println(pigLatin(args[0]));
    }

    public static String pigLatinSimple(String s) {
        s = s.toLowerCase();
        if ("aeiou".indexOf(s.charAt(0)) != -1) {
            return s + "hay";
        } else {
            return s.substring(1) + s.charAt(0) + "ay";
        }
    }

    public static String pigLatin(String s) {
        String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
        s = s.toLowerCase();
        if ("aeiou".indexOf(s.charAt(0)) != -1) {
            return s + "hay";
        } else if (s.length() > 1 && Arrays.asList(digraphs).contains(s.substring(0, 2))) {
            return s.substring(2) + s.substring(0, 2) + "ay";
        } else {
            return s.substring(1) + s.charAt(0) + "ay";
        }
    }
}
