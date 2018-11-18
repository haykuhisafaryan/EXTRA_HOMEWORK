public class Person{
    String name;
    int age;
    Post[] posts = new Post[100];
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void writePost(String content){
        Post p = new Post(this.name, content);
        for(int i = 0; i < this.posts.length; i++){
            if(posts[i] == null || posts[i].content == null){
                posts[i] = p;
                return;
            }
        }
    }


    public void writeComment(Post post, String content, String name){
        Comment c = new Comment(post, content, name);
        for(int i = 0; i < post.comments.length; i++){
            if(post.comments[i] == null || post.comments[i].content == null){
                post.comments[i] = c;
                return;
            }
        }
    }
    
    private static int fact(int num){
        int i = 1; 
        return Person.rec(num, i);
    }
    private static int rec(int num, int i){
            if(i == num ){
                return i;
            }
            return i*Person.rec(num, i+1);
    }

    public static void main(String[] args){
        Person p1 = new Person("Joe", 67);
        p1.writePost("Hello World");
        p1.writePost("Dooo");
        p1.posts[0].edit("CS110");
        p1.posts[1].delete();
        p1.writeComment(p1.posts[0], "Cool", p1.name);
        System.out.println(p1.posts[0].comments[0].content);
        System.out.println(p1.posts[0].content);
        p1.posts[0].comments[0].delete();
        System.out.println(p1.posts[0].comments[0].content);
        System.out.println(Person.fact(5));
    }
    
}