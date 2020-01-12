import java.io.IOException;

public class SocialPlatform {
    private APIManager apiManager;

    private static final String postsEndpoint = "https://jsonplaceholder.typicode.com/posts";

    public SocialPlatform() {
        this.apiManager = new APIManager();
    }

    public String listAllPosts() {
        try {
            String result = apiManager.get(postsEndpoint);
            return result;
        } catch (IOException e) {
            return null;
        }
    }
}
