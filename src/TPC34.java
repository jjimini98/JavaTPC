import java.util.Locale;

public class TPC34 {
    public static void main(String[] args) {
        // String                                            01234 <-- index
        java.lang.String str = new java.lang.String("APPLE");
        String r = str.toLowerCase();
        System.out.println(r);


        //String이 가지고 있는 메소드를 접근
        //자바 String에서 제공해주는 다양한 메소드들을 제대로 잘 가져다 쓰는 연습을 해야함
        System.out.println(str.charAt(3));
        System.out.println(str.length());
        System.out.println(str.indexOf("PL")); // 문자열이 있으면 시작 인덱스를 리턴
        System.out.println(str.indexOf("x"));
        System.out.println(str.replaceAll("P","X"));

    }
}
