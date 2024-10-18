import java.util.ArrayList;
/**
 * Write a description of class NewsFeed_ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewsFeed_
{
    private ArrayList<Post> posts;
    
    public NewsFeed_(){
        posts = new ArrayList<>();
    }
    
    public void addPost(Post post){
        posts.add(post);
    }
    
    public void show(){
        for(Post post : posts){
            post.display();
        }
    }
}
