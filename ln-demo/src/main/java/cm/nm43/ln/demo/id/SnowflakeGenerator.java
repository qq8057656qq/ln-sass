package cm.nm43.ln.demo.id;

import cn.hutool.core.util.IdUtil;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

/**
 * @author lvhuan
 * @version 1.0
 * Date 2020/10/28 7:28 下午
 * Description:
 */
public class SnowflakeGenerator implements IdentifierGenerator {

    private static final Long workerId = 1L;
    private static final Long dataCenterId = 2L;
    public static final String Type = "cm.nm43.ln.demo.id.SnowflakeGenerator";

    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException {
        return IdUtil.getSnowflake(workerId,dataCenterId).nextId();
    }
}
