import kr.tpc.MovieVO;

public class TPC18 {

    public static void main(String[] args) {
        //1차원 배열을 선언하는 방법 1
        int [] a = new int[5];

        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;

        //1차원 배열을 선언하는 방법 2
        int [] b = {10,20,30,40,50} ;

        //1차원 배열을 선언하는 방법 3
        int [] c = new int[] {10,20,30,40,50};

        for(int i = 0; i<b.length; i++){
            System.out.println(b[i]);
        }

        MovieVO mo = new MovieVO("인터스텔라","연기자",120000,12,1.3f);
        System.out.println(mo);

        //영화 세편을 저장 -> 객체 배열
        MovieVO[] marr = new MovieVO[3];
        marr[0] =new MovieVO("인터스텔라1","연기자1",12000,12,1.3f);
        marr[1] = new MovieVO("인터스텔라2","연기자2",1200,12,1.3f);
        marr[2] = new MovieVO("인터스텔라3","연기자3",120,12,1.3f);


        System.out.println(marr[0].toString());
        System.out.println(marr[1].toString());
        System.out.println(marr[2].toString());

        System.out.println("===================================================================");

        for (int i = 0; i<marr.length; i++) {
            System.out.println(marr[i]);


        }

    }
}
