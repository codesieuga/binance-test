package vn.com.kyber;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vn.com.kyber.job.BCacheUpdate;

@SpringBootApplication
public class Application implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("running");
        BCacheUpdate bCacheUpdate = new BCacheUpdate();
        bCacheUpdate.start();
    }
}
