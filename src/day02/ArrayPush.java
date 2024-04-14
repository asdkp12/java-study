package day02;

import java.util.Arrays;

public class ArrayPush {
    public static void main(String[] args) {

//        push = 맨 끝에 데이터 추가.
        int[] numbers = {10, 20, 30, 40};
        int newNumbers = 50;

//        1. 기존 사이즈보다 1개가 큰 새로운 배열 생성
        int[] temp = new int[numbers.length + 1];

//        2. 기존 데이터를 새로운 배열에 전부 복사
        for (int i = 0; i < numbers.length; i++) {
            temp[i] = numbers[i];

        }
//        3. 새 배열의 끝 인덱스에 넣을 데이터 추가하기
        temp[temp.length - 1] = newNumbers;
        System.out.println("temp.length = " + temp.length);


//        4. numbers 에 저장된 주소값을 temp 의 주소값으로 변경
        numbers = temp;

//        5. temp 는 더 이상 배열을 관리하면 안됨
        temp = null;

        System.out.println("numbers: " + Arrays.toString(numbers));
        System.out.println("temp: " + Arrays.toString(temp));
    }
}
