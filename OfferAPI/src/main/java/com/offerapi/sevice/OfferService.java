package com.offerapi.sevice;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offerapi.entity.Offer;

import repository.OfferRepository;

@Service
public class OfferService {

	OfferRepository offerRepository;
	
	@Autowired
	public OfferService(final OfferRepository or){
		offerRepository = or;
	}
	
	public Offer findByName(final String description) throws Exception{
		Offer offer = offerRepository.findByDescription(description);
		//validator refactor
		if (offer.getExpiryDate().compareTo(new Date()) < 0) {
			throw new Exception("The offer is expired");
		}
		if (offer.getExpiryDate().compareTo(new Date()) < 0) {
			throw new Exception("The offer is expired");
		}
		return offer;
	}
}
