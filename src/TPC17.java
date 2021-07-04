import kr.tpc.Overload;

public class TPC17 {
    public static void main(String[] args) {
        //1+1 , 12.5+24 , 11.2 + 54.2 각각의 결과가 궁금하다..
        Overload ov = new Overload();
        //사용자는 함수이름 하나만 알면 다양한 매개변수를 넣어서 사용이 가능하다.
        ov.hap(2,3); //ov.hap_int_int() 이름으로 호출 ( 컴파일러가 컴파일 시점에서 이름을 다 정해버림 )
        ov.hap(22.5f , 21); //ov.hap_float_int 이름으로 호출
        ov.hap(22.44f, 14.89f); //ov.hap_float_float 이름으로 호출
    }
}



