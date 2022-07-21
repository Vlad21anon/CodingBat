package CodingBat.Logic1;

public class inOrderEqual {
    public static void main(String[] args) {
        System.out.println(inOrderEqual(10,11,15,false));
    }


    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk)
            if (b>c || a>b)
                return false;
            else{
                return true;
            }
        if (b>a && c>b) {
            return true;
        }
        return false;
    }
}
