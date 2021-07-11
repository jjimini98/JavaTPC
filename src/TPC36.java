import kr.inflearn.intArray;

public class TPC36 {
    public static void main(String[] args) {
        //배열처럼 동작하는 클래스 --> API를 만들지 않으면 배열의 모든 기능을 다 알아야하는 문제가 있음

        // 정수 3개를 배열에 저장하고 출력하시오
        int [] a = new int[3];

        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        int v = a[1];
        int len = a.length;

        for (int i = 0 ; i<a.length; i++) {
            System.out.println(a[i]);
        }
        // ===================================================================
        // 만약 배열이 object 배열이라면 -> 모든 자료형을 담을 수 있음!

        intArray arr = new intArray(5);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr.size());

        for (int i = 0; i<arr.size();i++) {
            System.out.println(arr.get(i));
        }
    }
}
