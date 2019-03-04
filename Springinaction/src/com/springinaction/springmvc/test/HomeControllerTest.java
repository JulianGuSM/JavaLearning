package com.springinaction.springmvc.test;

import com.springinaction.springmvc.controller.HomeController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
/**
 * @author : Julian
 * @date : 2019/3/4 15:54
 */
public class HomeControllerTest {
    /**
     * Test home page.
     * 0
     *
     * I understand that this is a very old thread,
     * but in case anyone else runs into the same issue here's an answer.
     * andExpect() needs to be moved outside of the perform() function's
     * closing brackets
     *
     * @throws Exception the exception
     */
    @Test
    public void testHomePage() throws Exception{
        HomeController homeController = new HomeController();
        MockMvc mockMvc = standaloneSetup(homeController).build();
        mockMvc.perform(get("/")).andExpect(view().name("home"));
    }
}
