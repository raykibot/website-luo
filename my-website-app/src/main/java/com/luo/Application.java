package com.luo;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@Slf4j
@ComponentScan(basePackages = "com.luo.*")
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class);
    }

}
