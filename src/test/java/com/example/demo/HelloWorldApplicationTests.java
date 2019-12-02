package com.example.demo;

import java.net.URI;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldApplicationTests {

	 @Autowired
	    private WebApplicationContext webApplicationContext;
	    private MockMvc mockMvc;
	    
	@Before
	public void setupMockMvc() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void contextLoads() {
	}

	  @Test
	    public void testHello() throws Exception {
	        mockMvc.perform(MockMvcRequestBuilders.get(new URI("regist")))
	                .andExpect(MockMvcResultMatchers.status().isOk())
	                .andDo(MockMvcResultHandlers.print());
	    }
	
	@Test
	public void test1() {
//		@Mock
	}

}
