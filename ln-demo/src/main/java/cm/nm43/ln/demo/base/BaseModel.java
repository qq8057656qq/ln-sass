package cm.nm43.ln.demo.base;


import cm.nm43.ln.demo.id.SnowflakeGenerator;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.Instant;

/**
 * Description:
 *
 * @author lh
 * @version 1.0
 * Date:2022/3/12 12:12 PM
 */
@Getter
@Setter
@MappedSuperclass
public class BaseModel {
    @Id
    @GenericGenerator(name = "snowflake", strategy = SnowflakeGenerator.Type)
    @GeneratedValue(generator = "snowflake")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "create_time", nullable = false)
    @CreationTimestamp
    private Instant createTime;

    @Column(name = "update_time", nullable = false)
    @UpdateTimestamp
    private Instant updateTime;
}
