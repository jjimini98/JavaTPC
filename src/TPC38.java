import kr.tpc.BookDTO;

import java.util.ArrayList;

public class TPC38 {
    public static void main(String[] args) {
        ArrayList<BookDTO> list = new ArrayList<>(); //제네릭 기호를 써서 Object 타입이 아니고 BookDTO 타입으로 변경되는 것임
        list.add(new BookDTO("java",12000,"길벗",124));
        list.add(new BookDTO("python",20000,"이지스",400));
        list.add(new BookDTO("c",15000,"길벗",700));
        list.add(new BookDTO("c++",25000,"한빛미디어",559));

//        ArrayList list = new ArrayList();
//        list.add(new BookDTO("java",12000,"길벗",124));
//        list.add(new BookDTO("python",20000,"이지스",400));
//        list.add(new BookDTO("c",15000,"길벗",700));
//        list.add(new BookDTO("c++",25000,"한빛미디어",559));


        for(int i=0; i<list.size(); i++) {
//            Object o = list.get(i);
//            BookDTO vo = (BookDTO) o;
//            제네릭 타입을 쓰면 다운캐스팅 필요없음
            BookDTO o = list.get(i);
            BookDTO vo = o;
            System.out.println(vo.title+"\t" +vo.price +"\t" + vo.company + "\t"+ vo.page );
        }
    }
}
