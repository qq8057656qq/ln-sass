package cm.nm43.ln.demo.biz.member.repository;

import cm.nm43.ln.demo.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
