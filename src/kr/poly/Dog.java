package kr.poly;

public class Dog extends Animal {
    // 이름, 나이, 종, : 상태정보
    // 행위 정보 측면에서 바라봐야한다.
    public Dog() { //생성자 생성
        super(); //보통 super는 생략.. 보통 자식의 생성자를 호출할 때 부모의 생성자를 먼저 호출하라는 의미임 .

    }
    //메소드 오버라이딩
    public void eat() { //추상클래스의 추상메소드는 반드시 구현이 되어야 한다. 안그러면 에러남;
        System.out.println("멍멍멍");
    }

}
