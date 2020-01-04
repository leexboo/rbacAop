package com.lee.rbacAop.test;

import com.lee.rbacAop.Controller.PermissionController;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest
public class AopApplicationTests {

    @Autowired
    private PermissionController permissionController;

    private MockMvc mvc;

    @BeforeEach
    public void setupMockMvc() {
        mvc = MockMvcBuilders.standaloneSetup(permissionController).build();
    }

    @Test
    public void apiTest() throws Exception {
        MvcResult result = mvc.perform(MockMvcRequestBuilders.get("/permission/test")
                .accept(MediaType.APPLICATION_JSON)
                .header("token", "9527"))
                .andReturn();
        System.out.println("api test result : " + result.getResponse().getContentAsString());
    }

}
