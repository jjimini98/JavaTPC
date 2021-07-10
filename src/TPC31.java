import kr.tpc.*;

public class TPC31 {
    public static void main(String[] args) {
        A a = new A();
        display(a);

        B b = new B();
        display(b);


    }

    private static void display(Object o) { //다형성 인수
        if ( o instanceof A){
        ((A)o).go(); } // 쓸때는 다운캐스팅
        else{
        ((B)o).go(); }
    }

}
