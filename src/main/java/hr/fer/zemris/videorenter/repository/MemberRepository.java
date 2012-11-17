package hr.fer.zemris.videorenter.repository;

import hr.fer.zemris.videorenter.domain.Member;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends CrudRepository<Member, Long> {

}
