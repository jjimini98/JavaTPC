package kr.tpc;

public class MovieVO {

    // 상태 정보는 private로 은닉하기
    private String title;
    private String author;
    private int price;
    private int level;
    private float time;

    // 기본 생성자 명시
    public MovieVO() {}

    // 생성자 오버로딩
    public MovieVO(String title, String author, int price, int level, float time) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.level = level;
        this.time = time;
    }

    // getter 와 setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    //toString
    @Override
    public String toString() {
        return "MovieVO{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", level=" + level +
                ", time=" + time +
                '}';
    }
}
