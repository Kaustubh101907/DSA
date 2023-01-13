package CLass;

public class RemoveAdjecent {
    public static void main(String[] args) {
        String s = "AABBBAABBB";
        System.out.println(removeAdjecent(s));
    }

    private static int removeAdjecent(String s) {
        String str = "";
        str += s.charAt(0);
        for(int i = 1 ; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                continue;
            } else {
                str += s.charAt(i);
            }
        }
        System.out.println(str);
        return s.length() - str.length();
    }
}
