package day01;

public class TypeCasting {
    public static void main(String[] args) {

//        alt 1 파일 와리가리 단축키 방향키랑 쓰셈

        byte a = 100; //1byte
        int b = a; //4byte
        System.out.println("b = " + b);
//        이거 원래 불법임 타입이 다른데 대입 연산을 왜 함!!
//        암묵적 형 변환이라 합법임 사실 ㅋㅋ

        int c = 1000; // 4
//        명시적 형 변환.
        byte d = (byte)c;   // 1
        System.out.println("d = " + d);

        int k = 50;     //4byte
        double j = k;   //8byte
        System.out.println("j = " + j);

        double m = 5.567;
        int n = (int)m;
        System.out.println("n = " + n);

//        암묵적 형변환 -> upcasting (promotion)
//        명시적 형변환 -> downcasting
//        => 데이터 손실을 일으킬 수 있음.

        int v = 100;
        double z = 5.5;

//        타입이 다른 데이터의 연산은 작은 쪽을 큰 쪽으로 캐스팅한다.
        double result = v + z;
        System.out.println("result = " + result);

        float f1 = 3.14F;
        double f2 = 5.5;
        double v1 = f1 - f2;

        int x = 10, y = 20;

        System.out.println(x > 10 && (y / 0 == 10)); //false
        System.out.println(x > 10 || y < 30); //true
        //알트엔터 <- 자동완성시키는듯? 무슨 마법의 단축키네

    }
}
