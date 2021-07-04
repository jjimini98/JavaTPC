
import com.google.gson.Gson;
import com.sun.jdi.VMOutOfMemoryException;
import kr.bit.Book;
import kr.tpc.BookVO;
import kr.tpc.MyUtil;

import java.lang.*; // 이걸 안써도 실행이됨. (디폴트 패키지라서 생략이 가능하다. 빈번하게 자주사용하는 것들은 java.lang 에다가 넣어둠


public class TPC19 {
    public static void main(String[] args) {
        //1. java에서 제공해주는 class들 -> API
        //문자열을 조작하기 위해서 String이라는 클래스를 찾아야함

        String str = new String("APPLE"); //String의 메소드 중 소문자로 바꿔주는 메소드를 활용해보자.
        System.out.println(str.toLowerCase()); // apple

        //2. 직접 만들어서 사용하는 class들 DTO/VO , DAO , utility ... API
        MyUtil my = new MyUtil();
        int result = my.hap();
        System.out.println(result);

        //3. 다른 회사에서 만들어둔 API, class 사용하기
        // Gson을 사용해보자. -> json
        Gson g = new Gson();
        BookVO vo = new BookVO("자바","지민이네",15000,340);
        String json = g.toJson(vo); //Gson은 객체 형태를 문자열의 json 형태로 변환해준다.
        System.out.println(json);




    }
}


