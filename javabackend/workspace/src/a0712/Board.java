package a0712;

public class Board {
    private String subject;
    private String content;
    private String writer;

    public Board(String subject, String content, String writer) {
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject() {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent() {
        this.content = content;
    }

    public String getwWiter() {
        return writer;
    }

    public void setwWiter() {
        this.writer = writer;
    }

}
