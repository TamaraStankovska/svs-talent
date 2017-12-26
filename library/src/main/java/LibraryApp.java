import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LibraryApp {


    public static void main(String[] args) throws Exception {
        ApplicationContext cxt = SpringApplication.run(LibraryApp.class, args);
    }
}
