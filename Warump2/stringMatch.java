package CodingBat.Warump2;

public class stringMatch {
    public static void main(String[] args) {
        System.out.println(stringMatch("dasdsad","dasdadwd"));
    }

    public static int stringMatch(String a, String b) {
        int counter=0;
        int minLen = a.length()<b.length()?a.length():b.length();
        for(int i=0; i<minLen-1;i++){
            if(a.substring(i,i+2).equals(b.substring(i,i+2))){
                counter++;
            }
        }
        return counter;
    }

}
