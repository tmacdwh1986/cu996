package org.dadeco.cu996;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.dadeco.cu996"})
public class Cu996Application {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SpringApplication.run(Cu996Application.class, args);
    }

}
