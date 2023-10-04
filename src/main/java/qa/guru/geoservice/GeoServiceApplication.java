package qa.guru.geoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GeoServiceApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(GeoServiceApplication.class, args);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
