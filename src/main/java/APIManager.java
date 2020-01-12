import java.io.IOException;

import org.apache.log4j.Logger;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class APIManager {
    static final Logger logger = Logger.getLogger(APIManager.class);

    private OkHttpClient client;
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    public APIManager() {
        this.client = new OkHttpClient();
    }


    public String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder().url(url).post(body).build();
        Response response = client.newCall(request).execute();
        logger.debug("Sending POST request to " + url);
        return response.body().string();
    }

    public String get(String url) throws IOException {
        Request request = new Request.Builder().url(url).get().build();
        Response response = client.newCall(request).execute();
        logger.debug("Sending GET request to " + url);
        return response.body().string();
    }
}
