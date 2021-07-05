package kr.tpc;

public class Dog extends Animal{
    // 이름, 나이, 종, : 상태정보
    // 행위 정보 측면에서 바라봐야한다.
    public Dog() {
        super(); //보통 super는 생략.. 보통 자식의 생성자를 호출할 때 부모의 생성자를 먼저 호출하라는 의미임 .

    }
    //메소드 오버라이딩
    public void eat() {
        System.out.println("멍멍멍");
    }

}
