package kr.tpc;

//자바는 DBConnect 라는 인터페이스만 알고 있는 상태임. javaOracle이 어떻게 구현되었는지는 알지 못함
public class JavaOracle implements DBconnect {
    @Override
    public void getConnection(String url, String user, String password) {
        System.out.println("Oracle DB가 연결되었습니다");
        System.out.printf("현재 url : " +  url);
    }
}
