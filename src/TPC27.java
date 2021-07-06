import kr.poly.Radio;
import kr.poly.RemoCon;
import kr.poly.TV;

public class TPC27  {
    public static void main(String[] args) {

        //인터페이스와 추상클래스는 모두 "다형성"을 보장하기 위한 방법이다. ~

        //RemoCon remo = new RemoCon(); //인터페이스는 객체생성 불가능
        RemoCon re = new TV();
        re.chUp();
        re.chDown();
        re.internet();


        RemoCon re2 = new Radio();
        re2.chUp();
        re2.chDown();
        re2.internet();
        System.out.println(re2.MAXCH);
    }

}
