package day01;

public class DataType {

    public static void main(String[] args) {

        // 1byte == 8bit
        // 1bit == 숫자 0이나 1을 저장할 수 있음
        // 1111 => 8 + 4 + 2 + 1 == 15
        // 1 1111111 => + 64 + 32 + 16 + 8 + 4 + 2 +1 == 127

        // 1024byte == 1kb
        // 1024kb == 1mb
        // 아래는 정수를 담는 데이터 타입
        byte a = 127;           // 1byte
        short b = 32767;        // 2byte
        int c = 2147483647;     // 4byte
        long d = 2147483648L;    // 8byte
        // L 로 타입을 long 으로 바꿔줌
        System.out.println(d);

        float e = 3.14123412341234F; // 4byte
        double f = 3.14123412341234; // 8byte
        double g = 100;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);

        boolean flag1 = false;
        boolean falg2 = 10 > 5;

        double v = 5.5;
        int i = 1212;
        String asjdoasjd = "asjdoasjd";
        boolean b1 = a > b;
        // ctrl alt v = 값을 알맞은 데이터 타입에 담아준다
        // ctrl shift f10 = 실행 단축키
        // soutv = 변수 출력 System.out.println("e = " + e);
        double random = Math.random();


        int x = 200;
        System.out.println(x + a);
        System.out.println(b * x);


        // 문자형 char : 2byte 0~65536
        char text = '하'; // 한글자 저장.
        System.out.println("text = " + text);

        // 문자열 : 문자 배열
        // String : char 을 문자 배열로 바꿔줌
        char[] hello = {'안','녕','하','세','요'};
        System.out.println("hello = " + new String(hello));

        String hello2 = "안녕하세요";

//        기본타입은 8가지 정수,실수,논리,문자 => 용량이 딱 정해져 있음. 원시 타입.
//        String 은 기본타입이 아니다 => 용량이 정해져 있지 않음. 클래스 타입.
    }
}
