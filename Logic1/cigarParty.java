package CodingBat.Logic1;

public class cigarParty {
    public static void main(String[] args) {
        System.out.println(cigarParty(45,true));
    }
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars>=40 && cigars<=60 && !isWeekend) return true;
        if (cigars>=40 && isWeekend) return true;
        return false;
    }
}
