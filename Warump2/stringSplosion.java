package CodingBat.Warump2;

public class stringSplosion {
    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));
    }
    public static String stringSplosion(String str) {
        String answer = "";
        for(int i=0;i<str.length();i++){
            answer+= str.substring(0,i+1);

        }
        return answer;
    }
}
