import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        port(8080); // Set port

        get("/", (req, res) -> "Hello, Your Name!"); // Display your name
    }
}
