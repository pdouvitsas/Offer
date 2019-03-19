package com.offerapi.controllerTest;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest
public class ControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private OfferService personService;
	
	@Test
	public void insert_offer_then_search(){
		when(this.offerService.saveOrUpdate(any())).thenReturn(offer);
		this.mockMvc.perform(post("/offer")
           .contentType(MediaType.APPLICATION_JSON)
           .content(this.json(parentDto)))
           .andExpect(status().isOk());
	}
}
}
