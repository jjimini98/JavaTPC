package kr.tpc;

public class MemberVO {
    // class의 상태정보에 마구 접근 가능 : public
    private String name;
    private int age;
    private String tel;
    private String addr;

    public MemberVO() { } //필요하던 안하던 명시적으로 표시해두는 것이 좋음
    public MemberVO(String name, int age, String tel, String addr) {
        this.name = name;
        this.age = age;
        this.tel = tel;
        this.addr = addr;
    }

    //setter , getter 메소드 만들기 메소드이므로 조건문으로 걸러내기 가능
    public void setAddr(String addr) { this.addr = addr; }
    public String getAddr() { return addr; }

    public void setName(String name) { this.name = name; }
    public String getName(){ return name; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public String getTel() { return tel; }

    public void setTel(String tel) { this.tel = tel; }

    @Override
    public String toString() {
        return "MemberVO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tel='" + tel + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    } // 문자열로 바꿔서 하나로 출력해준다~
}
