import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {


        HttpRequest users = HttpRequest.newBuilder()
                .uri(new URI("https://gorest.co.in/public/v2/users"))
                .GET()
                .build();

        HttpClient client = HttpClient.newBuilder().build();
        HttpResponse<String> response = client.send(users, BodyHandlers.ofString());
        System.out.println(response.body());
    }
}