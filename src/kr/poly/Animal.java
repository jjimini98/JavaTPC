package kr.poly;

// Animal은 최상위 클래스인 Object를 상속한다.
public abstract class Animal extends Object { // 불완전한 메소드를 하나라도 가지고 있는 클래스는 추상클래스가 된다.
    //Animal ani = new Animal () ; --> X , 추상클래스의 경우 객체 생성을 할 수 없다. 대신 자식클래스에서 오버라이딩을 제대로 하면 명령을 내릴 수 있는 위치가 된다.

    // 반드시 자식 클래스가 eat() 메소드를 구현해서 재정의하도록 부모클래스에서 eat()의 구현부만 남겨둔다.
    public abstract void eat() ; //추상 메소드(불완전, 장애 메소드)

    public void move(){
        System.out.println("무리를 지어서 이동한다.");
    } //body가 있는 구현 메소드. 이는 그냥 재정의해도 되고 그냥 써도 되고
    //구현된 메소드를 쓸때는 자식 클래스들이 서로 비슷한 클래스여야지 사용이 가능하다.


}
