import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {
    public static void main(String[] args) {
        //Dog , Cat ==> Animal

        Dog d = new Dog();

        d.eat();

        Cat c = new Cat();
        c.eat();

        //이제는 Animal 코드만 가지고 Dog.class 와 Cat.class 를 동작시킬 줄 알아야한다.
//        Animal ani = new Dog();
//        ani.eat(); //Dog
//
//        ani = new Cat();
//        ani.eat();
//

    }


}
