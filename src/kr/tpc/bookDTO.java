package kr.tpc;

public class bookDTO { // 4개의 속성을 가진 bookDTO 생성
    public String title;
    public int price;
    public String company;
    public int page;
    // 눈에 보이지는 않지만 default 생성자가 있음
    public bookDTO() {super();}
    //기본 생성자는 객체를 생성하는 작업을 한다.생성자 내부 안에서 객체를 생성함.
    //객체 생성과 동시에 this 라는 객체 생성(생성자에 의해 메모리에 업로드가 되자마자 this 생성)

}
