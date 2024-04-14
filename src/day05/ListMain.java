package day05;

public class ListMain {
    public static void main(String[] args) {

        StringList foods = new StringList();
        StringList userNames = new StringList();

        // 배열 내부 데이터 수 확인
        System.out.println(foods.sArr.length);
        // 위와 같은 코드를 메서드를 통해서 만듬
        System.out.println(foods.size());

        // 배열에 데이터 추가
        foods.push("짬뽕");
        foods.push("치킨");
        foods.push("마라탕");
        foods.push("딸기");

        userNames.push("박영희");
        // 자료 삭제
        foods.remove(0);
        foods.remove("짬뽕");

        // 자료 중간 삽입
        userNames.push("김철수");
        userNames.push("홍길동");
        userNames.insert(2,"뽀로로");

        // 배열 데이터 수정
        foods.set(0, "반반치킨");

        // 전체삭제
        foods.clear();

        // 배열 데이터 한개라도 있는지 확인
        boolean falg = foods.isEmpty();

        StringList hobbies = new StringList("축구","영화감상","음악감상","멍때리기");

        System.out.println("foods = " + foods.toString());
        System.out.println("userNames = " + userNames.toString());
        System.out.println("falg = " + falg);
        System.out.println("hobbies = " + hobbies);



    }
}
