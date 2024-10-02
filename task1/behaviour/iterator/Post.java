package task1.behaviour.iterator;

public class Post {
    private String author;
    private String content;

    public Post(String content,String author){
        this.content = content;
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public String getContent(){
        return content;
    }

    @Override
    public String toString(){
        return "Post{" +
                "content='" + content + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
