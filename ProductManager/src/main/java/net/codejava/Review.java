package net.codejava;

import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Review {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @Column(name ="productId")
	    private Long productId;
	    
	    @Column(name ="comments")
	    private String comments;

	    @Column(name ="rating")
	    private int rating;

	    @Column(name = "reviewGroupDetails")
	    private  List<Review> reviewGroupDetails;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Long getProductId() {
			return productId;
		}

		public void setProductId(Long productId) {
			this.productId = productId;
		}

		public String getComments() {
			return comments;
		}

		public void setComments(String comments) {
			this.comments = comments;
		}

		public int getRating() {
			return rating;
		}

		public void setRating(int rating) {
			this.rating = rating;
		}

		public List<Review> getReview() {
			return reviewGroupDetails;
		}

		public void setReviewGroupDetails(List<Review> reviewGroupDetails) {
			this.reviewGroupDetails = reviewGroupDetails;
		}

		


}
