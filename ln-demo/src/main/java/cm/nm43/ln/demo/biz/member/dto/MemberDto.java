package cm.nm43.ln.demo.biz.member.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

/**
 * Description:
 *
 * @author lh
 * @version 1.0
 * Date:2022/3/16 10:32 PM
 */
@Data
public class MemberDto implements Serializable {
    private final Long id;
    private final Instant createTime;
    private final Instant updateTime;
    private final String userName;
    private final String nickName;
    private final Boolean birthSex;
    private final String mobile;
    private final String email;
    private final String password;
    private final Boolean enable;
    private final String salt;
    private final Long orgId;
    private final String avatar;
    private final Instant birthday;
    private final Instant rigesterDate;
    private final Instant lastLoginDate;
    private final String lastLoginIp;
    private final String updateBy;
}
