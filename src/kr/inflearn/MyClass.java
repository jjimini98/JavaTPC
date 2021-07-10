package kr.inflearn;

// 접근제어자를 생략하면 default 권한이 생성된다 -> default는 실제로 적어서 쓸 수는 없고 의미적으로 해석
public class MyClass {
    public int sum(int a , int b) {
        int result = 0;
        for(int i =0 ; i<=b ; i++){
            result +=i ;
        }
        return result;
    }

}
