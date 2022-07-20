package CodingBat.Warump2;

public class stringTimes {
    public static void main(String[] args) {
        System.out.println(stringTimes("Hi",5));
    }
    public static String stringTimes(String str, int n) {
        String answer = "";
        for(int i=1; i<=n; i++){
            answer+= str;
        }
        return answer;
    }
}
