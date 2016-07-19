package examples.service;

import examples.entity.MstRecommend;
import java.util.List;
import javax.annotation.Generated;

import static examples.entity.MstRecommendNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link MstRecommend}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.48", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2016/07/19 23:31:08")
public class MstRecommendService extends AbstractService<MstRecommend> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param recommendId
     *            識別子
     * @return エンティティ
     */
    public MstRecommend findById(Long recommendId) {
        return select().id(recommendId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<MstRecommend> findAllOrderById() {
        return select().orderBy(asc(recommendId())).getResultList();
    }
}