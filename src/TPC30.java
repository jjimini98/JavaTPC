import kr.poly.A;

public class TPC30 {
    public static void main(String[] args) {
        A a = new A();
        a.display();
        System.out.println(a.toString());
        System.out.println(a); //toString 생략해도 위와 같음


        Object o =  new A(); //upcasting
        ((A)o).display();
        System.out.println(o);  // A의 재정의된 값이 나옴
        //Object 클래스로 하위 클래스를 이용할 수 있다.

    }
}
