import kr.tpc.DBconnect;
import kr.tpc.JavaOracle;

public class TPC29 {
    public static void main(String[] args) {
        // oracle , mysql 등을 자바에서 사용하려면 driver class 가 필요하다.
        // JavaOracle , JavaMySQL과 같은 것들은 우리가 직접 구현하는게 아니고 jar 파일로 driver class의 형태로 배포가 된다.

        //오라클 안에 구현되어있는 내용을 모르므로 인터페이스 타입 으로 객체 생성
        DBconnect db = new JavaOracle();
        db.getConnection("127.0.0.1","jimin", "1234");




    }
}
