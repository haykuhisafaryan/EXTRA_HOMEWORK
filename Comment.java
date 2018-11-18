class Comment{
    String author;
    String content;
    Post post;
    public Comment(Post post, String content, String author){
        this.author = author;
        this.content = content;
        this.post = post;
    }

    public void edit(String text){
        this.content = text;
    }

    public void delete(){
        this.content = null;
    }

}