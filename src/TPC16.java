import kr.tpc.MemberVO;
//클래스를 잘 만드는 방법
//1. 모든 멤버는 프라이빗
//2. 기본 생성자는 명시해준다.
//3. 생성자를 오버라이딩해서 적당한 생성자를 만든다.
//4. setter와 getter 메소드를 사용한다.
//5. toString으로 모든 값들은 문자열로 한번에 가지고 온다.


public class TPC16 {
    public static void main(String[] args) {
        MemberVO m = new MemberVO("홍길동", 40, "010-1111-1111", "서울");
        // setter method가 필요 없음 바로 생성자 메소드에서 값을 받았기 때문임.

        System.out.println(m.toString()); // 문자열의 형태로 출력. toString의 형태임 toString을 만들어두지 않으면 일일이 써야한다는 문제가..  디버깅일 쉬움

        MemberVO m1 = new MemberVO();
        m1.setName("홍길동민");
        m1.setAge(33);
        m1.setTel("010-1111-1111");
        m1.setAddr("경기");

        System.out.print(m1.getName());
        System.out.print(m1.getTel());
        System.out.print(m1.getAge());
        System.out.print(m1.getAddr());

        System.out.println(m1); //m1이 가지고 있는 전체를 출력해주십셔 .. 자동으로 toString으로 출력해준다.



    }

}
