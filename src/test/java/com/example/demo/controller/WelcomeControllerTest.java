package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

import static org.hamcrest.Matchers.*;

@WebMvcTest
public class WelcomeControllerTest {

    // @Autowired
    // private WebApplicationContext webApplicationContext;

    // @Autowired
    // private MockMvc mockMvc;
    

    // @BeforeEach

    // public void setup() throws Exception {
    //     this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    // }

    // @Test
    // void shouldWelcomeRest() throws Exception {
    //     // WelcomeController welcomeController = new WelcomeController();
    //     // assertEquals("Welcome John!", welcomeController.welcome("John"));
    //     mockMvc.perform(get("/welcome")).andDo(print()).andExpect(status().isOk())
    //             .andExpect(content().string(equalTo("Welcome Jim!")));

    // }



}
