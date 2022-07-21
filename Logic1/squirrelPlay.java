package CodingBat.Logic1;

public class squirrelPlay {
    public static void main(String[] args) {
        System.out.println(squirrelPlay(120,true));
    }
    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if(isSummer) {
            if (temp<=100&&temp>=60) return true;
        }else if(!isSummer) {
            if (temp>=60&&temp<=90) return true;
        }
        return false;
    }
}
