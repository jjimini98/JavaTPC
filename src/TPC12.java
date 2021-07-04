import kr.tpc.BookVO;

public class TPC12 {
    public static void main(String[] args) {
        //생성자 -> 생성 + 초기화 (중복정의: 오버라이딩)

        // b1 객체 생성
        BookVO b1 = new BookVO();


        // 기본생성자에서 초기값으로 주어진대로 출력됨
        System.out.println(b1.title);
        System.out.println(b1.page);
        System.out.println(b1.price);
        System.out.println(b1.company);


        BookVO b2 = new BookVO();


        // b1과 똑같이 출력됨
        System.out.println(b2.title);
        System.out.println(b2.page);
        System.out.println(b2.price);
        System.out.println(b2.company);


        BookVO b3 = new BookVO("python", "지민이네", 180000, 320);
        System.out.println(b3.title);
        System.out.println(b3.page);
        System.out.println(b3.price);
        System.out.println(b3.company);

    }

}
