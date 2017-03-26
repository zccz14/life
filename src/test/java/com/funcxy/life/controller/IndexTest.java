package com.funcxy.life.controller;

import com.funcxy.life.contents.IndexResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

/**
 * Index Test
 */
@SuppressWarnings("SpringJavaAutowiredMembersInspection")
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class IndexTest {
    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void main() throws Exception {
        IndexResponse body = testRestTemplate.getForObject("/", IndexResponse.class);
        System.out.println(body.message);
    }
}
