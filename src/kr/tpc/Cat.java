package kr.tpc;

// 상속의 기본은 중복을 막는 것임.
// 실제로 클래스를 설계한 사람(나)는 클래스의 메소드에 대해 잘 안다.
// but 다른 사람이 클래스를 설계하고, dog.java 는 주지 않고, dog.class 파일만 준다면?
// class 파일은 우리 눈으로 확인하기가 어렵다.
public class Cat extends Animal  {
    public void night() {
        System.out.println("밤에는 눈에서 빛이난다.");
    }
}
