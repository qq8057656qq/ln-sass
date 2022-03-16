package cm.nm43.ln.demo.biz.member.repository;

import cm.nm43.ln.demo.model.Member;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Instant;

/**
 * Created by Leo on 2022/3/16.
 */

@DataJpaTest
@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
//    @Rollback(value = false)
    void should_insert() {
        Member member = new Member();
        member.setAvatar("avatar");
        member.setBirthday(Instant.now());
        member.setEmail("lvhuan2015@gmail.com");
        member.setUserName("14787471800");
        member.setMobile("14787471800");
        member.setNickName("leo");
        member.setRigesterDate(Instant.now());
        member.setPassword("fdsafsaf");
        member.setSalt("fdafda");
        memberRepository.save(member);
    }
}
