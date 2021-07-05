import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC22 {
    public static void main(String[] args) {

        //직접 자식 클래스 이용
        Dog d = new Dog();
        d.eat();

        Cat c = new Cat();
        c.eat();
        c.night();


        //Dog.class , Cat.class 파일만 있고 소스파일이 없음
        //안에 어떤 동작이 있는지 알 수 없다.
        //Animal-Dog, Animal-Cat 으로 서로 상속관계에 있는 전제하에 간접적으로 이용
        Animal ani = new Dog(); // upcasting
        ani.eat(); //부모의 타입으로 실행되지만 오버라이딩된 Dog로 출력

        ani = new Cat();
        ani.eat();
        ((Cat)ani).night(); // downcasting (Animal 타입을 Cat 타입으로)

        // eat()라는 메소드는 하나인데 ,
        //상위클래스가 하위 클래스에게 동일한 메세지를 보낸다. (여기선 eat())
        //하위 클래스는 이에 대한 반응을 하는데, 반응의 결과가 다르다 -> polymorphism 다형성임 .
        //상위클래스가 하위 클래스가 동일한 메세지를 보낼 때 서로 다르게 반응하는 원리 -> 다형성



    }
}
