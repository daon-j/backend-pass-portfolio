package ding.co.backendportfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableJpaAuditing
@SpringBootApplication
@EnableScheduling
public class BackendportfolioApplication {
    public static void main(String[] args) {

        System.out.println("정은 화이팅!!! 괜찮아!!! 해보는거지! 힘내자! 할수 있어!!");
        SpringApplication.run(BackendportfolioApplication.class, args);
    }

}
