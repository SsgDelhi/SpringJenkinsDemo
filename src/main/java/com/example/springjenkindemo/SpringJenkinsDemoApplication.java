package com.example.springjenkindemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsDemoApplication {

    public static Logger logger = LoggerFactory.getLogger(SpringJenkinsDemoApplication.class);

    @PostConstruct
    public void init() {
        logger.info("SpringJenkinsDemoApplication started");
    }

    public static void main(String[] args) {
        logger.info("main() method is called. \n Application is executed.");
        SpringApplication.run(SpringJenkinsDemoApplication.class, args);
    }

}
