package io.leeroy.boot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.addListeners(new ApplicationPidFileWriter());
        app.setWebApplicationType(WebApplicationType.SERVLET);
        app.run(args);
    }
}