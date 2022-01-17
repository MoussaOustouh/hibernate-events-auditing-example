package mo.spring.hibernateeventsauditingexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HibernateEventsAuditingExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateEventsAuditingExampleApplication.class, args);
    }

}
