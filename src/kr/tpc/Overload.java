package kr.tpc;

public class Overload {
    //동작으로만 이루어진 객체임 (overload로 !)

    public void hap(int a , int b) {
        System.out.println(a+b);
    }

    public void hap(float a , int b) {
        System.out.println(a+b);
    }

    public void hap(float a , float b) {
        System.out.println(a+b);
    }


}
