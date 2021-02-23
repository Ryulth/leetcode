public class Test {
    public static void main(String[] strings) {
        int a = -3;
        int b = 2;
        char c = (char) (a+'0');
        char c1 = (char)(a+'b');
        System.out.println(c);
        System.out.println(c1);
        System.out.println(Character.getNumericValue(c) + Character.getNumericValue(c1));
        System.out.println(a);
    }
}