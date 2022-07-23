package CodingBat.Warump1;

public class lastDigit {
    public static void main(String[] args) {
        System.out.println(lastDigit(7,17));
    }

    public static boolean lastDigit(int a, int b) {
        String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);
        if (s1.charAt(s1.length()-1) == s2.charAt(s2.length()-1)) return true;
        return false;
    }
}
