import kr.tpc.BookVO;

public class TPC11  {
    public static void main(String[] args) {

        // 책 한 권을 저장하기 위해 객체를 생성하시오. (객체를 생성하는 것이 핵심)
        BookVO b = new BookVO();
        b.title = "파이썬";
        b.price = 13000;
        b.page = 700;
        b.company = "지민이네";

        System.out.println(b.title);
        System.out.println(b.company);
        System.out.println(b.page);
        System.out.println(b.price);


        BookVO b1 = new BookVO();
        b1.title = "오라클";
        b1.company = "지민이네";
        b1.price = 15000;
        b1.page = 650 ;


        System.out.print(b1.title);
        System.out.print(b1.company);
        System.out.print(b1.price);
        System.out.print(b1.page);



    }
}
