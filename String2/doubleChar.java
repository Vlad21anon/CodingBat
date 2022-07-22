package CodingBat.String2;

public class doubleChar {
    public static void main(String[] args) {
        System.out.println(doubleChar("hello"));
    }


    public static String doubleChar(String str) {
        String answer = "";
        for(int e=0;e<str.length();e++){
            answer +=str.charAt(e);
            answer +=str.charAt(e);
        }
        return answer;
    }
}
