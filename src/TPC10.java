import kr.tpc.BookDTO;

public class TPC10 {
    public static void main(String[] args) {
        // int float char boolean - > PDT ( 기본 자료형)
        int a ;
        a = 10 ;

        //책이라는 자료형을 만들자. 클래스로 만들자
        BookDTO b = new BookDTO(); //new + 생성자 메서드
        b.title = " 헬로 자바 ";
        b.price = 17000;
        b.company =  " 지민이네 ";
        b.page = 130;

        System.out.println(b.title);
        System.out.println(b.company);
        System.out.println(b.price);
        System.out.println(b.page);



    }
}
