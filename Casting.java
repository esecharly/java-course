public class Casting {
    public static void main(String[] args) {
        byte b = 127;
        int a = 12;
        a = b; //This is conversion
        b = (byte) a; //This is casting
        System.out.println(a + "\n" + b);
    }
}
