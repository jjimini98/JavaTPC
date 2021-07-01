public class TPC04 {
    public static void main(String[] args) {
        // 4. 데이터 이동하기 (변수와 배열)

        //변수 3개 저장
        int a,b,c;
        a = 10;
        b = 20;
        c = 30;

        // a+b+c가 얼마냐 를 특정 메소드에서 처리해라 (메소드명은 hap)
        hap(a,b,c);

        //똑같은 기억공간 3개 만들기
        int [] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        hap1(arr);
    }
    public static void hap(int a, int b, int c ){
        int sum = a+b+c;
        System.out.println(sum);
    }

    public static void hap1(int[] x){
        //반복문 활용
        int sum = 0  ;
        //for (int i = 0 ; i <x.length ; i++) {sum += x[i]}
        for (int j : x) {
            sum += j;
        }

        System.out.println(sum);
    }

}
