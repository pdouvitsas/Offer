package repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.offerapi.entity.Offer;


@Repository
public interface OfferRepository extends PagingAndSortingRepository<Offer, Integer>{
	public Offer findById(Long id);
		
	public Offer findByDescription(String description);
}
