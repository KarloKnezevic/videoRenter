package hr.fer.zemris.videorenter.repository;

import hr.fer.zemris.videorenter.domain.Review;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Long> {

}
