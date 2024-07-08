package top.anyel.rrss;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SocialMediaProjectApplication {

    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.configure().load();
        // Obtener la variable de entorno y establecerla en el sistema
        System.setProperty("SPRING_DATA_MONGODB_URI", dotenv.get("SPRING_DATA_MONGODB_URI"));
        SpringApplication.run(SocialMediaProjectApplication.class, args);
    }

}
