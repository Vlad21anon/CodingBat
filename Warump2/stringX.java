package CodingBat.Warump2;

public class stringX {
    public static void main(String[] args) {
        System.out.println(stringX("xxdasdx"));
    }
    public static String stringX(String str) {
        String answ = "";
        for(int i=0; i<str.length();i++){
            if(i==0){answ+=str.charAt(i);}
            else if (str.charAt(i)!='x') {answ+=str.charAt(i);}
            else if(i==str.length()-1){answ+=str.charAt(i);}

        }
        return answ;
    }
}
