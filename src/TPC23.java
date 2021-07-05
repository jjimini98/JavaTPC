import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC23 {
    public static void main(String[] args) {
        //upcasting
        //Cat cat = new Cat();
        Animal ani = new Cat(); // upcasting
        //Object obj = new Cat(); 이것도 가능하다.
        ani.eat(); // 컴파일 시점에서는 animal의 eat 에 해당
        // 부모의 메소드를 자식이 오버라이딩하면 자식부분이 실행 -

        ((Cat)ani).night(); //ani의 타입을 Cat으로 바꾸면 Cat의 메소드를 쓸 수 있다.
        // Cat c = (Cat) ani;
        // c.ani ;  ((Cat)ani.night()을 풀어쓰면 두 줄 과 같다.

        ani = new Dog();
        ani.eat();
        //다형성 : 상위클래스가 하위 클래스에게 동일한 메세지를 보낼때 결과가 다르게 나온다 .
        //다형성의 이론은 우리 어디다가 실제로 활용할 수 있을까 ?


        Object o = new Dog(); //왜 무뜬금 Object인거지? Dog의 부모인 Animal의 부모임. 최상위 클래스.
//        o.eat(); //Object 타입에 eat()이 없으므로 에러
        ((Dog)o).eat();


    }
}
