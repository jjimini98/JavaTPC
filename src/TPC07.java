public class TPC07 {
    public static void main(String[] args) {

        int a = 20;
        float b = 56.7f;
        // a+b가 얼마지?
        //함수 호출 부분
        float result = sum(a,b); //call by Value a,b라는 이미 선언된 값을 함수로 전달해주는 방법
        //여기에 있는 a,b와 메소드에 있는 a,b는 서로 다른 기억공간(메모리)에 선언된다.

        System.out.println(result);

        int [] arr = {1,2,3,4,5};
        //배열의 총합구하기 with 메소드
        int res = arrSum(arr);//call by Reference(번지) ,선언된 배열의 번지수를 함수의 매개변수로 전달해주는 방법
        System.out.println(res);

        //함수를 호출하려면 실인수와 가인수  (실제값과 매개변수의 개수와 타입이 같아야지 가능하다)
    }


    public static int arrSum(int[] x) {
        int sum = 0 ;
        for (int i =0 ; i<x.length; i++){
            sum += x[i];
        }
        return sum;
    }

    public static float sum(int a, float b) {
        float v = a+b;
        return v;
    }



}
