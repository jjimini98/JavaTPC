import kr.tpc.BookDTO;

public class TPC14 {
    public static void main(String[] args) {
        //책 -> class BookDTO  -> 객체 -> 인스턴스

        //4개의 변수에 데이터가 들어있지만, 책이라고 보기 어려움, 4개의 변수에 그냥 책에 대한 정보가 들어있는 상태임
        String title = "스프링";
        int price = 25000;
        String company = "제이펍"  ;
        int page = 450 ;

        // 메소드로 이동하려면 하나로 묶어서 이동하는 것이 편함 1. 배열, 2. 구조 설계 (이질적인 데이터 타입의 경우 ) ->class
        // 클래스, 바구니가 필요함 -> 데이터를 묶어서 이동해야하므로
        BookDTO dto ; // dto는 그냥 오브젝트, 객체임.. 구체적으로 무엇인가를 가리키고 있지 않음, 뭔가를 담긴 담을텐데 뭔지 정하지 않음 구별불가
        dto = new BookDTO(title, price , company, page); //dto는 인스턴스가 된다. bookDTO가 생성이 되고 객체라고 하지만, 인스턴스 변수, 실체로 생김

        bookPrint(dto); //데이터를 묶어서 하나의 변수로서 이동하는 과정임

        }
        public static void bookPrint(BookDTO dto) {

            System.out.println(dto.price);
            System.out.println(dto.page);
            System.out.println(dto.title);
            System.out.println(dto.company);

        }


}
