package kr.poly;

public class TV implements RemoCon {


    @Override
    public void chUp() {
        System.out.println("TV의 채널이 올라갑니다");

    }

    @Override
    public void chDown() {
        System.out.println("TV의 채널이 내려갑니다");
    }

    @Override
    public void internet() {
        System.out.println("인터넷 사용이 가능합니다");
    }

    //TV의 추가적인 (독자적인) 기능이 있다면 추가가능
}
