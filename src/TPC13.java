import kr.tpc.Inflearn;

public class TPC13 {
    public static void main(String[] args) {

        // Inflearn inf = new Inflearn(); // Inflearn 이라는 객체가 생성되고 그 안에는 java와 tpc 메소드가 존재한다. (heap area, non-static zone에 기계어 코드 존재)
        //inf.java() 이렇게 해도 되지만 불완전한 방법

        //클래스 이름으로 접근 : 아 그러면 객체생성하지말고 클래스 이름으로 접근해도 되겠다! 그런경우 생성자를 private으로 변경하고 모든 메소드를 static 상태로 변경한다.

        Inflearn.tpc();
        Inflearn.java();






    }


}
