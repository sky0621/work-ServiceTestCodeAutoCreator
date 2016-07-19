package examples.service;

import examples.entity.MstUser;
import java.util.List;
import javax.annotation.Generated;

import static examples.entity.MstUserNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link MstUser}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.48", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2016/07/19 23:31:08")
public class MstUserService extends AbstractService<MstUser> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public MstUser findById(Long id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<MstUser> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}