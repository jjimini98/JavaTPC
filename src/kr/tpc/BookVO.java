package kr.tpc;

import kr.bit.Book;

public class BookVO {
    // 책의 가격, 제목, 출판사, 페이지수
    public String title;
    public int price;
    public String company;
    public int page;
    // default 생성자 메소드가 생략되어있음


    // 디폴트 생성자
    // 만약 디폴트 생성자가 없다면? 여기 코드에서는 디폴트 생성자가 만들어지지 않는다.
    // 생성자가 하나도 없으면 디폴트 생성자가 생기지만, 생성자가 하나라도 이미 정의가 되어있으면 디폴트 생성자는 만들어지지 않는다.

    public BookVO() {
        // 초기화 작업 : 각 변수에 값을 넣기
        this.title = "자바";
        this.price = 4000;
        this.company = "지민이네";
        this. page = 780;  }

    //생성자 메소드의 중복정의 ( 오버라이딩) 메소드 이름은 같아도되나 매개변수의 개수 또는 데이터타입이 달라야함)
    public BookVO(String title, String company, int price, int page){
        this.title = title;
        this.page   = page;
        this.company = company;
        this.price = price;  }



}
