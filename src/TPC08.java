public class TPC08 {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;
        int result = add(a,b); //static method인 add 호출
        // add 메소드가 static이 아니면,, 에러가 날 것임(main은 자동으로 static으로 로딩이 되지만, add가 static이 아니면 로딩이 되지 않아서)
        System.out.println(result);
    }
    public static int add(int a, int b) { //static 메소드 static zone에서 자동으로 기계어의 상태로 로딩된다.
        int sum = a+b;
        return sum;
    }
}
