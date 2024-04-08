package day02;

import java.io.IOException;
import java.util.Scanner;

public class StdIO {

    public static void main(String[] args) throws IOException {


//        줄바꿈 ln 으로 하거나 \n 으로 해야하는데 printf 같은건 \n이 필수적임
//        System.out.printf("%s의 강이지\n");
//        System.out.printf("%s의 강이지\n");

//        자바에서 키보드 입력받기
//        ctrl alt v 이건 또 뭐임 변수로 만들어주는듯
        Scanner scan = new Scanner(System.in); // 입력준비 딱 1회만 하면 됨

//        문자 입력받기
        System.out.print("이름: ");
        String userName = scan.nextLine();
        System.out.println("userName = " + userName);

//        정수 입력받기 - 문자를 입력받은 뒤 정수로 변환
        System.out.print("출생년도: ");
        int birthYear = Integer.parseInt(scan.nextLine());
        System.out.println("birthYear = " + birthYear);

    }
}
