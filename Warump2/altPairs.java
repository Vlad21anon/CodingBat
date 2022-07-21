package CodingBat.Warump2;

public class altPairs {
    public static void main(String[] args) {
        System.out.println(altPairs("abcdefjhig"));
    }

    public static String altPairs(String str) {
        int len = str.length();
        String answ = "";
        for(int i=0; i<len;i++){
            if (i%4==0){
                answ += str.charAt(i);
                if(i+1<=len-1){
                    answ +=str.charAt(i+1);
                }

            }
        }

        return answ;
    }

}
