
/**
 * Write a description of class MessagePost_ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost_ extends CommentedPost
{
    private String message;
    
    /**
     * Constructor for objects of class MessagePost_
     */
    public MessagePost_(String author, String text)
    {
        super(author);
        message = text;
    }
    
    /**
     * Return the text of this post.
     * 
     * @return The post's text.
     */
    public String getText()
    {
        return message;
    }
}
