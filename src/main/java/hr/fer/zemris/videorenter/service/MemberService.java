package hr.fer.zemris.videorenter.service;

import hr.fer.zemris.videorenter.domain.Member;

import java.util.List;

public interface MemberService {

	Member getMember(Long id);
	Member createMember(Member member);
	void deleteMember(Member member);
	Member saveMember(Member member);
	
	List<Member> listMembers();
}
