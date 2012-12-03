package hr.fer.zemris.videorenter.repository;

import hr.fer.zemris.videorenter.domain.Movie;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {

}
