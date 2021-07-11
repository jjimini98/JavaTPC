import kr.inflearn.objectArray;
import kr.tpc.*;

import java.util.ArrayList;

public class TPC37 {
    public static void main(String[] args) {
        //objectArray arr = new objectArray(5); //길이가 5로 고정되어있어서 배열의 확장이 불가능
        ArrayList arr = new ArrayList(5); //배열의 길이에 제약이 없다. 우리가 만든 배열 클래스와 같은 함수들을 사용할 수 있다.
        arr.add(new A());
        arr.add(new A());
        arr.add(new A());
        arr.add(new B());
        arr.add(new B());
        arr.add(new A());

        for (int i = 0; i < arr.size();i++) {
            Object o = arr.get(i);
            if (o instanceof A) {
                ((A)o).go();
            }
            else {
                ((B)o).go();
            }
        }
    }
}
