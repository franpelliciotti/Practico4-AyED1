
/**
 * Write a description of class EventPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract class EventPost extends Post
{
    private String eventType;
    private String eventAuthor;

    /**
     * Constructor for objects of class EventPost
     */
    public EventPost(String author, String type)
    {
        super(author);
        eventAuthor = author;
        eventType = type;
    }
    
    public String getType(){
        return "" + eventType;
    }
    
    public String getAuthor(){
        return "" + eventAuthor;
    }
    
    public void display(){
        System.out.println(getAuthor() + " has " + getType());
    }
}
