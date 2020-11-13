package net.codejava;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ReviewServices {

	@Autowired
	private ReviewRepository repo;
	
	@Autowired
	
	private ReviewAvg repoavg;
	
	public List<Review> listAll() {
		return repo.findAll();
	}
	
	public void save(Review Review) {
		repo.save(Review);
	}
	
	public Review get(long id) {
		return repo.findById(id).get();
	}
	
    double calculateAverageReview(Iterable<Integer> productId){
    List<Review> groupDetails = repoavg.findAllById(productId);
    if(groupDetails.isEmpty()) {
    	try {
			throw new Exception("Not valid id");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    }
    List<Review> ratingList = new ArrayList<>();
    groupDetails.stream().forEach(review ->
        ratingList.addAll(review.getReview())
    );
    
    return ratingList.stream().mapToInt(val -> val.getRating()).average().orElse(0.0);
    }


}
