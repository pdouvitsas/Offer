package com.offerapi;

import java.time.LocalDate;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.offerapi.entity.Offer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OfferApiApplicationTests {

	
	private static final String OFFER_DESCRIPTION = "offer description";
	
	LocalDate localDatePlusThreeDays = LocalDate.now().plusDays(3);
	
	LocalDate localDateMinusThreeDays = LocalDate.now().minusDays(3);
	
	@Before
	
	
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void insert_offer_then_search(){
		Offer offerCreated = new Offer (OFFER_DESCRIPTION, localDatePlusThreeDays).;
		
		Offer offerRetrieved = offerSearchService.findByName(OFFER_DESCRIPTION);
		assertTrue(offerRetrieved.getDescription().equals(OFFER_DESCRIPTION));
	}
	
	@Test
	public void insert_offer_expired_then_search_expired(){
		Offer offerCreated = new Offer (OFFER_DESCRIPTION, localDateMinusThreeDays);
		
		Offer offerRetrieved = offerSearchService.findByName(OFFER_DESCRIPTION);
		assertTrue(offerRetrieved.getDescription().equals(OFFER_DESCRIPTION));
		assertTrue(offerRetrieved.getStatus().ordinal() == );
	}

}
