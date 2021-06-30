import kr.bit.Book; //Book 클래스를 보면 임포트를 해줌
import kr.bit.PersonVO;

public class TPC03 {
    public static void main(String[] args) {
        // 관계를 이해하라 PDT VS UDDT
        // 정수 1개를 저장하기 위한 변수 선언하기
        int a ; // 변수 선언 메모리 어딘가에 a가 생김
        a = 10; // a에 정수 10을 저장

        //책 1권을 저장하기 위한 변수 선언하기
        //데이터 타입이 책임 자료형을 뭐라고 해야하지?

        Book b ; // Book이라는 자료형으로 선언 변수 b는 하나만 들어갈 수 있음
        // 현실세계의 책은 한 권으로 표현되지만 , 프로그래밍에서  책은 책을 이루고 있는 다양한 정보들을 메모리에 저장해야함
        // book 을 이루고 있는 다양한 변수들을 각자 저장해도 되지만 하나로 묶어서 쓰는게 편하다.
        // 따라서, Book 에 해당하는 구조를 설계해야함. 어떤 도구로 ? class 로
        // 메모리에 실제로 객체를 생성해야 사용 가능
        b = new Book();  // ()는 생성자/ 우리가 원하는대로 Book이 생성됨 b에는 Book의 번지가 들어감. b 에는 주소값이 저장
        // 객체로 생성된 실체 : instance b는 객체,인스턴스를 가리키고 있는 인스턴스, 객체 변수 b가 이제 책이 됨
        // 직접 b로 Book에 접근해서 값 넣어보기
        b.title = "자바책";
        b.price = 15000;
        b.company = "헬로자바";
        b.page = 700;
        b.author = "지민";
        System.out.print(b.title + "\t");
        System.out.println(b.author);
        System.out.println(b.page);
        System.out.println(b.price);


        PersonVO p;

        p = new PersonVO();

        p.name = "철수";
        p.age = 22;
        p.height = 158f;
        p.weight = 55.555f ;


        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.height);
        System.out.println(p.weight);

    }
}
