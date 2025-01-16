package com.example.FOROHUBFINAL.controller;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class test {



    @SpringBootTest
    @AutoConfigureMockMvc
    public class TópicoControllerTest {

        @Autowired
        private MockMvc mockMvc;

        @Test
        void testObtenerTópicos() throws Exception {
            mockMvc.perform(get("/api/tópicos")
                            .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk());
        }
    }

}
