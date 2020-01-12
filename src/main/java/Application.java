import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Application {
    static final Logger logger = Logger.getLogger(Application.class);

    public static void main(String[] args)
    {
        // Configure logger
        BasicConfigurator.configure();

        logger.debug("Application is up and running!");

        SocialPlatform socialPlatform = new SocialPlatform();

        logger.debug("Social platform instance created!");

        String posts = socialPlatform.listAllPosts();

        if (posts != null) {
            System.out.println(posts);
        }
    }
}
