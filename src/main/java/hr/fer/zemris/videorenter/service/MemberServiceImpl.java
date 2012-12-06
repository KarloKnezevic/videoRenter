package hr.fer.zemris.videorenter.service;

import hr.fer.zemris.videorenter.domain.Member;
import hr.fer.zemris.videorenter.repository.MemberRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberRepository memberRepository;

	@Override
	public Member createMember(Member user) {
		return memberRepository.save(user);
	}
	
	@Override
	public Member getMember(Long id) {
		return memberRepository.findOne(id);
	}

	@Override
	public void deleteMember(Member user) {
		memberRepository.delete(user);
		
	}

	@Override
	public Member saveMember(Member user) {
		return memberRepository.save(user);
	}

	@Override
	public List<Member> listMembers() {
		return (List<Member>) memberRepository.findAll();
	}
	
	
}
