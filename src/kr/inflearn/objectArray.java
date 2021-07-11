package kr.inflearn;

public class objectArray {
    private int count;
    private Object[] arr;
    public objectArray() {this(10);}
    public objectArray(int init) {
        arr = new Object[init];
    }

    public void add(Object data) {
        arr[count++] =data;
    }

    public Object get(int index){
        return arr[index];
    }
    public int size(){
        return count;
    }

}