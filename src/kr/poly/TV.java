package kr.poly;

public class TV implements RemoCon {

    int currCH = 70;

    @Override
    public void chUp() {

        if (currCH < RemoCon.MAXCH) {
            currCH ++;
            System.out.println("TV의 채널이 올라갑니다 : " + currCH);
        }
        else {
            currCH = 1 ;
            System.out.println("TV의 채널이 올라갑니다 : " + currCH);

        }

    }

    @Override
    public void chDown() {
        if (currCH > RemoCon.MINCH)  {
        currCH -- ;
        System.out.println("TV의 채널이 내려갑니다: " + currCH ); }
        else {
            currCH = 100 ;
            System.out.println("TV의 채널이 내려갑니다: " + currCH) ;
        }
    }

    @Override
    public void internet() {
        System.out.println("인터넷 사용이 가능합니다");
    }

    //TV의 추가적인 (독자적인) 기능이 있다면 추가가능
}
