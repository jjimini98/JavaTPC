public class TPC06 {
    public static void main(String[] args) {
        //메서드 -> 프로그램 에서의 동작(method),기능(function)
        //정수 2개를 매개변수로 받아서 총합을 더해서 리턴하는 메소드
        int a = 98;
        int b = 67;
        int result = sum(a,b); //매개변수 전달 기법 Call by Value : 함수가 호출될때 값을 호출한다.
        System.out.println(result);

        int [] arr = makeArr();
        int hap =0 ;
        for (int i = 0; i<arr.length; i++){
            hap +=  arr[i];
        }
        System.out.println(hap);
    }

    public static int sum(int a, int b) { //void로 하면 return 값이 없다는 의미. 이 메소드는 리턴값이 있으니까 int
        //메인 함수에서 sum이라는 함수를 호출하려면 메모리에 로딩이 되어있어야 호출이 가능하다.
        //메인과 같은 static으로 해두자.. static메소드에서 다른 메소드를 호출할 때 같은 static이면 편함..
        int v = a+b;
        return v;
    }
    // 이번 내용의 중요한 것 : 메소드는 메소드의 이름에 값을 담아서 전달한다. 메소드의 이름은 변수의 역할을 동시에 한다.

    // 10,20,30을 리턴하고 싶으면?
    public static int[] makeArr() { //makeArr 의 return 값이 int[]
        int a = 10;
        int b = 20;
        int c = 30;

        int [] arr = new int [3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        return arr ; // arr 자체가 3개의 값을 가진 하나의 기억공간

        // return a,b,c;  // 이것은 불가능. 하나의 리턴값을 가져야하는데 여기선 3개라 불가능
        // 모든 메소드는 하나의 값의 형태로 해야함. like 담배
    }
}
