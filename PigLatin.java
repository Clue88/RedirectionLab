public class PigLatin {
    public static void main(String[] args) {
        System.out.println(pigLatinSimple("mock"));
        System.out.println(pigLatinSimple("pie"));
        System.out.println(pigLatinSimple("david"));
        System.out.println(pigLatinSimple("aaron"));
    }

    public static String pigLatinSimple(String s) {
        s = s.toLowerCase();
        if ("aeiou".indexOf(s.charAt(0)) != -1) {
            return s + "hay";
        } else {
            return s.substring(1) + s.charAt(0) + "ay";
        }
    }
}
