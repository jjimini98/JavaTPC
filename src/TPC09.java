public class TPC09 {
    public static void main(String[] args) {
        int a = 56;
        int b = 40;
        // a+b =?
        //객체를 생성하는 과정 (heap area 에 생성됨)
        TPC09 tpc = new TPC09(); // 객체 생성
        int  v  = tpc.sum(a,b);
        System.out.println(v);
    }
    public int sum(int a, int b) {
        int v = a+b;
        return v;
    }
}
