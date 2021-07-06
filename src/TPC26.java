import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC26 {
    public static void main(String[] args) {
        // Animal의 eat()를 Dog에서 재정의를 했다는 전제가 되어야 다형성이 보장이 된다.
        // Dog가 재정의를 하지 않았다면 Animal의 eat가 나올것 : 제대로 된 동작이 아님. 즉, 자식클래스의 eat()가 반드시 오버라이딩을 해야함.

        //추상클래스는 upcasting으로 활용
        Animal ani = new Dog();
        ani.eat(); //Dog의 eat가 출력됨. 다형성이 보장됨~!!
        ani.move();
        // 다형성 보장을 위해 부모 Animal 클래스를 추상클래스로 생성

        //Animal a = new Animal(); // 추상클래스라 객체생성 불가능

        Animal ani1 = new Cat() ; //upcasting
        ani1.eat();
        ((Cat)ani1).night(); //downcasting
        ani1.move();

    }

}
