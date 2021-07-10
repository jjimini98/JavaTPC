public class TPC35 {
    public static void main(String[] args) {
        String str1 = new String("APPLE"); //str1 이라는 객체가 생성되는 것임
        String str2 = new String("APPLE");
        if (str1 == str2) { // 단순 번지 수 비교
            System.out.println("YES");
        }
        else{
            System.out.println("NO");

        }
        if (str1.equals(str2)){ // 값 자체를 비교 str1이 가리키는 값과 str2가 가리키는 값 자체가 같은지  다른지 비교
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        String str3 = "APPLE";
        String str4 = "APPLE";

        if (str3 == str4) { // 단순 번지 수 비교
            System.out.println("YES");
        }
        else{
            System.out.println("NO");

        }
        if (str3.equals(str4)){ // 값 자체를 비교 str1이 가리키는 값과 str2가 가리키는 값 자체가 같은지  다른지 비교
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
