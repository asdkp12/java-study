package day04;

public class Singer {
// 필드: 객체의 속성 정의
    String singerName;
    String crewName;
    String genre;
    int singLevel;

    void introduce () {
        System.out.println("singerName = " + singerName);
        System.out.println("crewName = " + crewName);
        System.out.println("genre = " + genre);
        System.out.println("level = " + singLevel);
    }
    Singer(String sName , String cName ,String gName ,int sLevel) {
        singerName = sName;
        crewName = cName;
        genre = gName;
        singLevel = sLevel;
    }
}
