package variable;

public class Variable2 {
    public static void main(String[] args) {
        // 정수   int
        int a = 10;
        byte a1 = 100; // 127
        byte a2 = 100;
        byte a3 = (byte) (a1 + a2); // int
        System.out.println(a3);
        //int a4 = 2150000000;
        long a5 = 2150000000L;
        long a6 = 1150000000 + 1150000000L;
        System.out.println(a6);

        char ch = '가'; // character
        System.out.println((int)ch);

        char ch2 = '\u0042'; // unicode
        System.out.println(ch2);

        char ch3 = 0xac00; // unicode  44032
        System.out.println(ch3);

        // 실수 double
        double d = 10.0;
        float f = 10.0F;

        float f2 = (float) (10.1 + 10);



        // Boolean
        boolean b = true;
    }
}
