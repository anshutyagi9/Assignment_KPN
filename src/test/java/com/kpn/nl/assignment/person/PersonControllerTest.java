package com.kpn.nl.assignment.person;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

//import junit.framework.Test;
//import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PersonControllerTest
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	
	

		@Autowired
	    private MockMvc mockMvc;

	    @Test
	    public void shouldReturnOk() throws Exception {
	        this.mockMvc.perform(get("/api/personapp/v1/person/id/1")).andDo(print()).andExpect(status().isOk())
	                ;
	    }
	    
	    @Test
	    
	    public void shouldReturnNotFound() throws Exception {
	        this.mockMvc.perform(get("/api/personapp/v1/person/id/12")).andDo(print()).andExpect(status().isNotFound())
	                ;
	    }
	

}