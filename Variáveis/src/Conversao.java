public class Conversao {

    public static void main(String[] args) {

        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;

        long l1;
        int i1 = 10;
        l1 = i1;

        int i2;
        long l2 = 1000000000000000000L;
        i2 = (int) l2;

        int i3;
        long l3 = 10000L;
        i3 = (int) l3;

        double d1;
        float f1 = 10.5f;
        d1 = f1;

        float f2;
        float f3;
        double d2 = 10000.58d;
        f2 = (float) d2;
        double d3 = 1000.58888888888888888888883333333333333333333333121333333333333333332222222222222D;
        f3 = (float) d3;

        System.out.println("b1: " + b1);
        System.out.println("s1: " + s1);
        System.out.println("l1: " + l1);
        System.out.println("i1: " + i1);
        System.out.println("i2: " + i2);
        System.out.println("l2: " + l2);
        System.out.println("i3: " + i3);
        System.out.println("l3: " + l3);
        System.out.println("d1: " + d1);
        System.out.println("f1: " + f1);
        System.out.println("f2: " + f2);
        System.out.println("f3: " + f3);
        System.out.println("d2: " + d2);
        System.out.println("d3: " + d3);

        int i = 3;
        int a = 10 - 5 * 2 + --i;
        System.out.println(a);
    }
}
