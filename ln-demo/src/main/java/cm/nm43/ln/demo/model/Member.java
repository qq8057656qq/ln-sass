package cm.nm43.ln.demo.model;

import cm.nm43.ln.demo.base.BaseModel;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "ln_member")
@Getter
@Setter
public class Member extends BaseModel {
    @Column(name = "user_name", length = 128)
    private String userName;

    @Column(name = "nick_name", length = 64)
    private String nickName;

    @Column(name = "birth_sex")
    private Boolean birthSex;

    @Column(name = "mobile", length = 32)
    private String mobile;

    @Column(name = "email", length = 64)
    private String email;

    @Column(name = "password", nullable = false, length = 128)
    private String password;

    @Column(name = "enable", nullable = false)
    private Boolean enable = false;

    @Column(name = "salt", nullable = false, length = 32)
    private String salt;

    @Column(name = "org_id")
    private Long orgId;

    @Column(name = "avatar", length = 64)
    private String avatar;

    @Column(name = "birthday")
    private Instant birthday;

    @Column(name = "rigester_date", nullable = false)
    private Instant rigesterDate;

    @Column(name = "last_login_date")
    private Instant lastLoginDate;

    @Column(name = "last_login_ip", length = 32)
    private String lastLoginIp;

    @Column(name = "is_deleted", nullable = false)
    private Boolean isDeleted = false;

    @Column(name = "update_by", length = 64)
    private String updateBy;


}
