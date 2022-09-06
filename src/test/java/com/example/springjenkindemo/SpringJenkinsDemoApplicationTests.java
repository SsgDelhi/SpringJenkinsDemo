package com.example.springjenkindemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsDemoApplicationTests {

    public static Logger logger = LoggerFactory.getLogger(SpringJenkinsDemoApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("contextLoads() ********\n********\n*********\n********");
        Assertions.assertEquals(true, true);
    }

}
