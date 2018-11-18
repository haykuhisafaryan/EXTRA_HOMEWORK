public class Post{
    String author;
    int commentNum = 0;
    int likeNum = 0;
    String content;
    Comment[] comments = new Comment[50];

    public Post(String author, String content){
        this.author = author;
        this.content = content;
    }

    public void edit(String text){
        this.content = text;
    }

    public void delete(){
        this.content = null;
    }
}