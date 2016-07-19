package examples.service;

import examples.entity.MstCategory;
import java.util.List;
import javax.annotation.Generated;

import static examples.entity.MstCategoryNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link MstCategory}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.48", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2016/07/19 23:31:08")
public class MstCategoryService extends AbstractService<MstCategory> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param categoryId
     *            識別子
     * @return エンティティ
     */
    public MstCategory findById(Long categoryId) {
        return select().id(categoryId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<MstCategory> findAllOrderById() {
        return select().orderBy(asc(categoryId())).getResultList();
    }
}