package cm.nm43.ln.demo.biz.member.service.impl;

import cm.nm43.ln.demo.biz.member.repository.MemberRepository;
import cm.nm43.ln.demo.biz.member.service.MemberService;
import cm.nm43.ln.demo.model.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Description:
 * @author lh
 * @version 1.0
 * Date:2022/3/16 10:20 PM
 */
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

  private final MemberRepository memberRepository;


  @Override
  public Member register() {
    return null;
  }
}
