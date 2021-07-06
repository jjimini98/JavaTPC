package kr.poly;

public interface RemoCon { //객체 생성 불가능. RemoCon re = new RemoCon(); <--사용 불가

    // 상수를 사용할 수 있다. final 키워드가 붙으면 변경이 불가능하다.
    // 객체를 생성하지 않고도 접근하는 방법 -> 클래스이름.변수명 -> 인터페이스는 객체를 생성할 수 없어서 , 상수값에 접근하려면 클래스이름으로 접근해야한다.
    public static final int MAXCH = 100; // RemoCon.MAXCH
    public final static int  MINCH = 1;  // RemoCon.MINCH

    public abstract void chUp() ; //abstract가 생략되어있음
    public abstract void chDown();
    public abstract void internet();
}
