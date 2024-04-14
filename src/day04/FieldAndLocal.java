package day04;

public class FieldAndLocal {
    // 필드는 값을 초기화하지 않아도
    // 각 타입의 기본값으로 자동 세팅
    // 정수: 0 , 실수: 0,0 논리: flase, 문자(char):'', 나머지: null
    double aaa;

    void foo(int ccc) {
        int bbb = 20;

        System.out.println("aaa = " + aaa);
        System.out.println("bbb = " + bbb);
        System.out.println("ccc = " + ccc);
    }
}
