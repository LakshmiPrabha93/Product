package net.codejava;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ReviewAvg  extends JpaRepository<Review,Integer>{

		@Query(value ="SELECT * from review r where r.id = :id", nativeQuery = true)
	    List<Review> findAllByReviewGroupId(@Param("id") int id);
	}	

