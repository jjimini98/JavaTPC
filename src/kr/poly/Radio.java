package kr.poly;

public class Radio implements RemoCon{

    @Override
    public void chUp() {
        System.out.println("Radio의 채널이 올라갑니다");
    }

    @Override
    public void chDown() {
        System.out.println("Radio의 채널이 내려갑니다");
    }

    @Override
    public void internet() {
        System.out.println("인터넷을 사용할 수 없습니다");

    }
    //Radio의 추가적인 (독자적인) 기능이 있다면 추가가능
}
