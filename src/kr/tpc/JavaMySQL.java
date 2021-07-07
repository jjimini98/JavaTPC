package kr.tpc;

public class JavaMySQL implements DBconnect {
    @Override
    public void getConnection(String url, String user, String password) {
        System.out.println("MySQL DB가 연결되었습니다");
    }
}
