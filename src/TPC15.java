import kr.tpc.MemberVO;

public class TPC15 {
    public static void main(String[] args) {
        MemberVO m = new MemberVO();

//        m.name ="홍길동";
//        m.age = 50;
//        m.tel = "010-1111-1111";
//        m.addr = "서울";



        m.setName("홍길동"); //setname을 호출해서 홍길동을 넣는다.
        m.setAge(55);
        m.setAddr("서울");
        m.setTel("010-1111-1111");

        System.out.println(m.getAddr());
        System.out.println(m.getAge());
        System.out.println(m.getTel());
        System.out.println(m.getName());



    }
}
