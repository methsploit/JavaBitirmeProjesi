package com.mehmeteminturkoglu.javabitirme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class JavaBitirmeApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaBitirmeApplication.class, args);
    }

}
