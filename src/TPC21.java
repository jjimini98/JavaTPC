import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC21  {
    public static void main(String[] args) {
        //Animal ani = new Dog(); //상속일 때, 부모가 자식을 가리킨다. 하위클래스의 타입이 자식클래스의 타입으로 자동으로  형변환이 됨 -> 오브젝트 캐스팅
        //보통 자식을 작은 타입, 부모가 큰 타입이라고 하는데, 작은 타입이 큰 타입으로 형변환 되는 것을 업캐스팅이라고 한다.

        // 부모 클래스를 하나도 사용하지 않은 코드임 : 상속의 이점을 제대로 활용하지 않은 경우에 해당한다.

        Dog d = new Dog(); // Dog 클래스 안에 메소드들을 다 알고 있는 경우 , 이렇게 쓰면 된다.
        d.eat(); // 부모의 eat는 무시되고 재정의 된 eat가 출력됨

        Cat c = new Cat();
        c.eat();
        c.night();


        // 만약 Dog , Cat 안에 어떤 동작이 있는지 모르는 경우? 어떻게 해야할까
        Animal ani = new Dog(); //upcasting 자동 형변환
        ani.eat(); //여기에선 Animal 타입이라 ? 가 나와야하는데 멍멍멍이 나옴 : Dog의 동작 방식을 모르고 animal만 알아도 가능하다.

        ani = new Cat();
        ani.eat();
        //ani.night();
        ((Cat)ani).night(); //다운 캐스팅, 강제 형변환


    }
}
