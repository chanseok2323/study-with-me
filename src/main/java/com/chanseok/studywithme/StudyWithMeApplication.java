package com.chanseok.studywithme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class StudyWithMeApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyWithMeApplication.class, args);
    }

}
