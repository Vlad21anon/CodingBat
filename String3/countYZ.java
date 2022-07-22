package CodingBat.String3;

public class countYZ {
    public static void main(String[] args) {
        System.out.println(countYZ("abcz zbz Zyz yzy, YZY"));
    }

    public static int countYZ(String str) {
        int counter =0;
        for(int i=1;i<str.length();i++){
            if(!Character.isLetter(str.charAt(i))){
                if (str.charAt(i-1)=='y' || str.charAt(i-1)=='z'
                        || str.charAt(i-1)=='Y' || str.charAt(i-1)=='Z'){counter++;}
            }
        }

        if(Character.isLetter(str.charAt(str.length()-1))) {
            if (str.charAt(str.length()-1)=='y' || str.charAt(str.length()-1)=='z'
                    || str.charAt(str.length()-1)=='Y' || str.charAt(str.length()-1)=='Z')
                counter++;
        }
        return counter;
    }
}
