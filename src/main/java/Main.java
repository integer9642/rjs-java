public class Main {
    public static void main(String[] args) {
        //국룰
        System.out.println("hello java!!!");

        //변수
        int num = 5;
        System.out.println(num);

        String rjs = "Hello RJS";
        System.out.println(rjs);

        //final로 선언해주면 더이산 변수 재정의 불가
        final int finalNumber = 1;
        System.out.println(finalNumber);

        short s = 1;
        System.out.println(s);

        int a = 3;
        System.out.println(a);

        long b = 4;
        System.out.println(b);

        //float 뒤에는 F
        float f = 5.5F;
        System.out.println(f);

        double d = 5.5;
        System.out.println(d);

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MIN_VALUE);

        char c = 'A';
        System.out.println(c);

        boolean fact = true;
        System.out.println(fact);
        fact = false;
        System.out.println(fact);

        byte data = 'd';
        System.out.println(data);
    }
}