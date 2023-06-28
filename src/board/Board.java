package board;

public class Board {
    private String title; // title 변수 생성
    private String content; // content 변수 생성
    private String author; // author 변수 생성

    public Board(String title, String content, String author) {
        this.title = title;
        this.content = content;   // 각 변수들 입력받은 현제값 저장
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {          // 입력받은 변수들을 현재 변수값에 할당.
        return content;
    }

    public String getAuthor() {
        return author;
    }
}
