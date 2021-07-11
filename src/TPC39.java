public class TPC39 {
    public static void main(String[] args) {
        int a = 1;
        //Integer b = new Integer(1); //java.lang 안에 있어서 굳이 import 안해도 됨/ 에러남;;
        Integer b = 1; //Boxing 내부적으로 new Integer(1)로 바꿔줌
        System.out.println(b.intValue()); //1
        System.out.println(b.toString()); //'1'

        Object [] obj = new Object[2];
        //1,2 값 넣기 with Integer 클래스 활용
//        obj[0] = new Integer(1); //부모에 자식값을 넣어주는 업캐스팅
//        obj[1] = new Integer(2);

        // boxing 기법으로도 값 넣기 가능
        obj[0] = 1;
        obj[1] = 2;

        System.out.println(obj[0].toString());
        System.out.println(obj[1].toString());


        // "100" + "100" = 200 만들기
        //각각을 정수 100, 100으로 변경
        String x = "100";
        String y = "100";
        System.out.println(x+y); //문자열의 결합
        int x1 = Integer.parseInt(x); //parseInt는 static 이라서 숫자형태의 문자열을 int 형태로 바꿔준다.
        int y1 = Integer.parseInt(y);
        System.out.println(x1+y1);

        // 100 + 100 = "100100" 숫자를 문자열로
        String s1 = String.valueOf(x1); // int 형의 숫자를 String형태로 변환
        String s2 = String.valueOf(y1);
        System.out.println(s1+s2);
    }
}
