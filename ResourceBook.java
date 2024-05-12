public class ResourceBook implements ResourceDescription{
    private String resourceID;
    private String title;
    private String author;

    public ResourceBook(String resourceID, String title, String author) {
        this.resourceID = resourceID;
        this.title = title;
        this.author = author;
    }

    public String getResourceID() {
        return resourceID;
    }

    public void setResourceID(String resourceID) {
        this.resourceID = resourceID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
       return "Book";
    }
}