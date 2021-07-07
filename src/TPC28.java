import kr.poly.*;

public class TPC28 {
    public static void main(String[] args) {
        //RemoCon으로 tv클래스를 구동하시오 .
        RemoCon re = new TV() ;
        for (int i = 0 ; i < 50; i++) {
            re.chUp();
        }
        for (int i = 0; i< 40; i++){
        re.chDown(); }
//        re.chUp();
        re.internet();





    }
}
