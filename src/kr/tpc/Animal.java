package kr.tpc;

// Animal은 최상위 클래스인 Object를 상속한다.
public class Animal extends Object {
    // cat과 dog의 공통부분
    public void eat() {
        System.out.println("?"); // 동물이 어떻게 먹지? 너무 포괄적이고 추상적
    }
    public Animal() {}

}
