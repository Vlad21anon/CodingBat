package CodingBat.Warump2;

public class stringYak {
    public static void main(String[] args) {
        System.out.println(stringYak("yakkikiyak"));
    }

    public static String stringYak(String str) {
        String answer =str;
        for (int i=0; i<answer.length()-2;i++){
            if(answer.charAt(i)=='y'&&answer.charAt(i+1)=='a'&&answer.charAt(i+2)=='k') {
                answer = answer.substring(0, i) + answer.substring(i+3);
            }
        }

        return answer;
    }

}
