import java.io.IOException;

import org.apache.log4j.Logger;

public class SocialPlatform {
    static final Logger logger = Logger.getLogger(SocialPlatform.class);
    private APIManager apiManager;

    private static final String postsEndpoint = "https://jsonplaceholder.typicode.com/posts";

    public SocialPlatform() {
        this.apiManager = new APIManager();
    }

    public String listAllPosts() {
        try {
            String result = apiManager.get(postsEndpoint);
            logger.debug("Succesfully listed posts !");
            return result;
        } catch (IOException e) {
            logger.error("Error while listing posts ! Error: " + e.getLocalizedMessage());
            return null;
        }
    }
}
