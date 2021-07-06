import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC25 {
    public static void main(String[] args) {
        //2. 다형성 배열
        //dog타입과 cat타입을 저장할 배열을 생성해라! 배열은 동일한 타입이 아니면 생성하기가 어렵다.

        //서로 다른 타입을 부모타입으로서 배열에다가 저장이 가능하다.
        Animal [] ani = new Animal[2]; //여기에다가 Object [] ani = new Object[2];
        ani[0] = new Dog();
        ani[1] = new Cat();

        //각각 배열에 담긴 객체의 eat를 출력한다.
        for(int i = 0; i < ani.length; i++){
            ani[i].eat();
            if (ani[i] instanceof Cat) { // downcasting
                ((Cat) ani[i]).night(); //for문을 돌 때 Cat타입이 아닌것도 있어서 에러가 날 수 있다.
            }
        }
        //main 안에다가 반복문으로 처리해도 되지만 따로 메소드를 만들어서 호출해서 사용해도 됨.
        display(ani);

    }

    //main의 for문과 같은 역할을 하는 메소드 display
    private static void display(Animal[] ani) { //다형성배열임
        for(int i = 0; i < ani.length; i++){
            ani[i].eat();
            if (ani[i] instanceof Cat) { // downcasting
                ((Cat) ani[i]).night(); //for문을 돌 때 Cat타입이 아닌것도 있어서 에러가 날 수 있다.
            }
        }
    }
}
