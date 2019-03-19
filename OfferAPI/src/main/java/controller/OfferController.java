package controller;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.offerapi.domain.OfferDto;
import com.offerapi.entity.Offer;
import com.offerapi.sevice.OfferService;

@RestController
public class OfferController {
	
	OfferService offerService;
	
	@Autowired
	public OfferController(final OfferService offerService) {
		this.offerService = offerService;
	}
	
	@RequestMapping(value = "/saveoffer", method = RequestMethod.POST)
	public ResponseEntity<?> saveOffer(HttpServletRequest request, @RequestBody final OfferDto offerDto ) throws ParseException {
		Long offerId = offerService.saveOrUpdate(convertToEntity(offerDto)).getId();
		return ResponseEntity.ok(offerId);

	}

	@RequestMapping(value = "/searchoffer", method = RequestMethod.GET)
	public OfferDto getPerson(HttpServletRequest request, @RequestParam("description") String description) throws ParseException {
		Offer offer = offerService.findByName(description);
		return convertToDto(offer);
	}
	
}
