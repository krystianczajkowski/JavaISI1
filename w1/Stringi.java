import java.util.HashMap;

class Stringi {
    public static void main() {
        String h = "hello                                o";
        String rh = swapFirstAndLastChars(h);
        String rw = removeWhitespace(h);
        System.out.println(rh);
        System.out.println(rw);
        System.out.println(reverseString(h));
        piramiduj('*', 3);
        StringBuilder sb = new StringBuilder();
        sb.append("Dystrybuanta");
        System.out.println(mostFrequentChar(sb));
        insertSubstring(sb, "***");
        System.out.println(sb);
    }

    public static String swapFirstAndLastChars(String s) {
        StringBuilder ret = new StringBuilder();
        ret.append(s.charAt(s.length() - 1));
        for (int i = 1; i < s.length() - 1; i++) {
            ret.append(s.charAt(i));
        }
        ret.append(s.charAt(0));
        return ret.toString();
    }

    public static String removeWhitespace(String s) {
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                ret.append(s.charAt(i));
            }
        }
        return ret.toString();
    }

    public static String reverseString(String s) {
        StringBuilder ret = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            ret.append(s.charAt(i));
        }
        return ret.toString();
    }

    public static void piramiduj(char ch, int n) {
        StringBuilder p = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * 2 - i; j++) {
                p.append(' ');
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                p.append(ch);
            }
            p.append('\n');
        }
        System.out.println(p.toString());
    }

    public static char mostFrequentChar(StringBuilder sb) {
        HashMap<Character, Integer> cMap = new HashMap<Character, Integer>();
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (cMap.containsKey(c)) {
                cMap.put(c, cMap.get(c) + 1);
            } else {
                cMap.put(c, 1);
            }
        }
        int max = 0;
        char ret = sb.charAt(0);
        for (char key : cMap.keySet()) {
            if (max < cMap.get(key)) {
                max = cMap.get(key);
                ret = key;
            }
        }
        return ret;
    }

    public static void insertSubstring(StringBuilder sb, String toInsert) {
        int mid = sb.length() / 2;
        sb.insert(mid, toInsert);
    }
}
