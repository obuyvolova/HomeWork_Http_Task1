import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {
    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final String upvotes;

    public Post(@JsonProperty("id") String id,
                @JsonProperty("text") String text,
                @JsonProperty("type") String type,
                @JsonProperty("user") String user,
                @JsonProperty("upvotes") String upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "\nId: " + id +
                "\nText: " + text +
                "\nType: " + type +
                "\nUser: " + user +
                "\nUpvotes: " + upvotes;
    }
}
