package com.example.demo.acceptance;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.hamcrest.Matchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class DemoApplicationIT {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldWelcomeRest() throws Exception {
        // WelcomeController welcomeController = new WelcomeController();
        // assertEquals("Welcome John!", welcomeController.welcome("John"));
        mockMvc.perform(get("/welcome"))
        // .andDo(print())
        .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Welcome Jim!")));
    }

    @Test
    void shouldStart() throws Exception {
        // WelcomeController welcomeController = new WelcomeController();
        // assertEquals("Welcome John!", welcomeController.welcome("John"));
        mockMvc.perform(get("/start"))
        // .andDo(print())
        .andExpect(status().isOk())
                .andExpect(content().string(equalTo("start with-par start-par!")));

    }

}
