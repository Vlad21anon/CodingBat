package CodingBat.String2;

public class countHi {
    public static void main(String[] args) {
        System.out.println(countHi("hidsahihih"));
    }


    public static int countHi(String str) {
        int counter = 0;
        for (int i=0;i<str.length()-1;i++){
            if (str.charAt(i)=='h' &&str.charAt(i+1)== 'i') counter++;
        }
        return counter;
    }
}
