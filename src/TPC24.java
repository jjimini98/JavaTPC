import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC24 {
    public static void main(String[] args) {
        //다형성 인수
        Dog d = new Dog();
        display(d);
        Cat c = new Cat();
        display(c);



    }
                                //이 부분, 함수의 매개변수로 들어올 때 자동으로 upcasting이 된다. upcasting이 되면 downcasting도 가능
    private static void display(Animal r) {//동물 객체가 엄청 많아지면 그만큼 메소드도 많아진다. 확장성에 문제가 됨.
        r.eat(); //한 번은 dog의 eat가 다른 한 번은 cat의 eat가
        //r.night();
        //((Cat)r).night(); //맨처음에 인수로 dog 타입이 들어오면 해당되지 않으므로 에러가 남.
        if (r instanceof Cat) {
            //if 문으로 조건에 해당하는 부분만 처리하게끔 변경 A instanceof B는 B타입으로 만들어진 A임을 의미
            // 맞으면 True 리턴 틀리면 False 리턴해줌
            ((Cat)r).night(); // if문이 True면 downcasting
        }



    }


}
