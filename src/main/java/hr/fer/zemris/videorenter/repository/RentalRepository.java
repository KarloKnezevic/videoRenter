package hr.fer.zemris.videorenter.repository;

import hr.fer.zemris.videorenter.domain.Rental;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalRepository extends CrudRepository<Rental, Long> {

}
