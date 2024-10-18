import java.util.ArrayList;

/**
 * Write a description of class Post here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract class Post
{
    private String username;  
    private long timestamp;
    
    /**
     * Constructor for objects of class Post
     */
    public Post(String author)
    {
        username = author;
        timestamp = System.currentTimeMillis();
    }
    
    /**
     * Return the time of creation of this post.
     * 
     * @return The post's creation time, as a system time value.
     */
    public long getTimeStamp()
    {
        return timestamp;
    }
    
    /**
     * Create a string describing a time point in the past in terms 
     * relative to current time, such as "30 seconds ago" or "7 minutes ago".
     * Currently, only seconds and minutes are used for the string.
     * 
     * @param time  The time value to convert (in system milliseconds)
     * @return      A relative time string for the given time
     */
    
    protected String timeString(long time) //El tema de la visibilidad queda standby. No quiero que el método sea público, pero si es privado, no me deja acceder luego en CommentedPost en el método display.
    {
        long current = System.currentTimeMillis();
        long pastMillis = current - time;      // time passed in milliseconds
        long seconds = pastMillis/1000;        // milliseconds to seconds
        long minutes = seconds/60;             // seconds to minutes
        if(minutes > 0) {
            return minutes + " minutes ago";
        }
        else {
            return seconds + " seconds ago";
        }
    }
    
    public String getUsername(){
        return "" + username;
    }
    
    public long getTimestamp(){
        return timestamp;
    }
    
    abstract void display();
}
