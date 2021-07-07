package kr.poly;
import java.lang.*; //생략되어잇음

public class A extends Object  { //extends Object 생략되어있음
    public A() { // 생략되어있음
        super();
    }
    public void display(){
        System.out.println("나는 A이다");
    }

    // 여기 부분을 생략하면 A라는 객체의 번지가 출력된다. : kr.poly.A@3b07d329
    @Override
    public String toString() {
        return "재정의 메서드 입니다";
    }
}
