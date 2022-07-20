package CodingBat.Warump2;

public class stringBits {
    public static void main(String[] args) {
        System.out.println(stringBits("Hello"));
    }

    public static String stringBits(String str) {
        String answer="";
        for(int i=0; i<str.length(); i +=2){
            answer+= str.charAt(i);
        }
        return answer;
    }
}
