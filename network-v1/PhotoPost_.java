
/**
 * Write a description of class PhotoPost_ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhotoPost_ extends CommentedPost
{
    private String filename;
    private String caption;
    
    /**
     * Constructor for objects of class PhotoPost_
     */
    public PhotoPost_(String author, String filename, String caption)
    {
        super(author);
        this.filename = filename;
        this.caption = caption;
    }

    /**
     * Return the file name of the image in this post.
     * 
     * @return The post's image file name.
     */
    public String getImageFile()
    {
        return filename;
    }

    /**
     * Return the caption of the image of this post.
     * 
     * @return The image's caption.
     */
    public String getCaption()
    {
        return caption;
    }
}
